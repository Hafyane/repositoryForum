package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Villeclt;
import org.springframework.transaction.annotation.Transactional;

public interface IVillecltService {

	@Transactional
	public void addVilleclt(Villeclt villeclt);

	@Transactional(readOnly = true)
	public List<Villeclt> getVillesclt();

	@Transactional
	public void deleteVilleclt(Integer id);

	@Transactional(readOnly = true)
	public Villeclt searchVilleclt(Integer id);
	
	@Transactional
	public Villeclt updateVilleclt(Villeclt villeclt);

}
