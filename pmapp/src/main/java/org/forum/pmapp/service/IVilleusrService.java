package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Villeusr;
import org.springframework.transaction.annotation.Transactional;

public interface IVilleusrService {

	@Transactional
	public void addVilleusr(Villeusr villeusr);

	@Transactional(readOnly = true)
	public List<Villeusr> getVilleusr();

	@Transactional
	public void deleteVilleusr(Integer id);

	@Transactional(readOnly = true)
	public Villeusr searchVilleusr(Integer id);

	@Transactional
	public Villeusr updateVilleusr(Villeusr villeusr);

}