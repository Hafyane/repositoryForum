package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Projet;
import org.springframework.transaction.annotation.Transactional;


public interface IProjetService 
{
	@Transactional
	public void addProjet(Projet projet);

	@Transactional(readOnly = true)
	public List<Projet> getProjet();

	@Transactional
	public void deleteProjet(Integer id);

	@Transactional(readOnly = true)
	public Projet searchProjet(Integer id);

	@Transactional
	public Projet updateProjet(Projet projet);
}