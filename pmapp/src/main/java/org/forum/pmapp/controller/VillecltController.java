package org.forum.pmapp.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.forum.pmapp.entities.Villeclt;
import org.forum.pmapp.service.IVillecltService;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gestion")
public class VillecltController {

	private static final org.slf4j.Logger logger = LoggerFactory
			.getLogger(VillecltController.class);

	@Resource(name = "villecltService")
	private IVillecltService villecltserv;

	/**
	 * POST VilleClt -> Create a new Ville-Client.
	 * 
	 * @throws URISyntaxException
	 */

	@RequestMapping(value = "/villeclients", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> create(@Valid @RequestBody Villeclt villeclt)
			throws URISyntaxException {

		logger.debug("REST request to create Ville-Client : {}", villeclt);

		if (villeclt.getIdVille() != null) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"A new Villeclt cannot already have an ID").build();
		}

		villecltserv.addVilleclt(villeclt);
		return ResponseEntity.created(new URI("/gestion/allvilleclt")).build();
	}

	/**
	 * GET /technologies -> get all the Ville-Client.
	 */

	@RequestMapping(value = "/villeclients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Villeclt> allvilleclt() {
		logger.debug("REST request to get all Villeclt");
		return this.villecltserv.getVillesclt();
	}

	/**
	 * GET /Villeclt/:id -> get the "id" Villeclt.
	 */
	@RequestMapping(value = "/villeclients/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Villeclt> get(@PathVariable Integer id,
			HttpServletResponse response) {
		logger.debug("REST request to get Ville-Client : {}", id);

		Villeclt villeclt = this.villecltserv.searchVilleclt(id);

		if (villeclt == null) {
			return new ResponseEntity<Villeclt>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Villeclt>(villeclt, HttpStatus.OK);
	}

	/**
	 * DELETE /Villeclt/:id -> delete the "id" Ville-clt.
	 */
	@RequestMapping(value = "/villeclients/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deletevilleclt(@PathVariable Integer id) {
		logger.debug("REST request to delete Ville-Client id : {}", id);
		this.villecltserv.deleteVilleclt(id);
	}

	/**
	 * PUT /villeclt -> Updates an existing villeclt.
	 * 
	 * @throws URISyntaxException
	 */
	@RequestMapping(value = "/villeclients", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> update(@Valid @RequestBody Villeclt villeclt)
			throws URISyntaxException {
		logger.debug("REST request to update Ville-Client : {}", villeclt);

		this.villecltserv.updateVilleclt(villeclt);

		return ResponseEntity.ok().build();
	}

}
