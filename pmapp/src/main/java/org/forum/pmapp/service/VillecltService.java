package org.forum.pmapp.service;

import java.util.List;
import javax.annotation.Resource;
import org.forum.pmapp.dao.IDao;
import org.forum.pmapp.entities.Villeclt;
import org.springframework.stereotype.Service;

@Service("villecltService")
public class VillecltService implements IVillecltService {
	@Resource(name = "villecltDAO")
	private IDao<Villeclt> villecDAO;

	public IDao<Villeclt> getVillecDAO() {
		return villecDAO;
	}

	public void setVillecDAO(IDao<Villeclt> villecDAO) {
		this.villecDAO = villecDAO;
	}

	@Override
	public void addVilleclt(Villeclt villeclt) {
		this.villecDAO.save(villeclt);
	}

	@Override
	public List<Villeclt> getVillesclt() {

		return this.villecDAO.getAll();
	}

	@Override
	public void deleteVilleclt(Integer id) {
		this.villecDAO.delete(id);
	}

	@Override
	public Villeclt searchVilleclt(Integer id) {

		return this.villecDAO.findbyid(id);
	}

	@Override
	public Villeclt updateVilleclt(Villeclt villeclt) {
		
		return this.villecDAO.update(villeclt);
	}

}
