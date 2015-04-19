package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Phase;
import org.springframework.transaction.annotation.Transactional;


public interface IPhaseService 
{
	@Transactional
	public void addPhase(Phase phase);

	@Transactional(readOnly = true)
	public List<Phase> getPhase();

	@Transactional
	public void deletePhase(Integer id);

	@Transactional(readOnly = true)
	public Phase searchPhase(Integer id);

	@Transactional
	public Phase updatePhase(Phase phase);
}