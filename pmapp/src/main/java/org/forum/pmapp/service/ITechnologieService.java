package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Technologie;
import org.springframework.transaction.annotation.Transactional;


public interface ITechnologieService 
{
	@Transactional
	public void addTechnologie(Technologie technologie);

	@Transactional(readOnly = true)
	public List<Technologie> getTechnologie();

	@Transactional
	public void deleteTechnologie(Integer id);

	@Transactional(readOnly = true)
	public Technologie searchTechnologie(Integer id);

	@Transactional
	public Technologie updateTechnologie(Technologie technologie);	
}