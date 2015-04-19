package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Retard;
import org.springframework.transaction.annotation.Transactional;


public interface IRetardService 
{
	@Transactional
	public void addRetard(Retard retard);

	@Transactional(readOnly = true)
	public List<Retard> getRetard();

	@Transactional
	public void deleteRetard(Integer id);

	@Transactional(readOnly = true)
	public Retard searchRetard(Integer id);

	@Transactional
	public Retard updateRetard(Retard retard);
	
}