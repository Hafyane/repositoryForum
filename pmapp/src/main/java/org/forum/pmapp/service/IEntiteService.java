package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Entite;
import org.springframework.transaction.annotation.Transactional;


public interface IEntiteService 
{
	@Transactional
	public void addEntite(Entite entite);

	@Transactional(readOnly = true)
	public List<Entite> getEntite();

	@Transactional
	public void deleteEntite(Integer id);

	@Transactional(readOnly = true)
	public Entite searchEntite(Integer id);
	
	@Transactional
	public Entite updateEntite(Entite entite);
}