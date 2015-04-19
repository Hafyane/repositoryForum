package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Sousaction;
import org.springframework.transaction.annotation.Transactional;

public interface ISousactionService
{
	@Transactional
	public void addSousaction(Sousaction sousaction);

	@Transactional(readOnly = true)
	public List<Sousaction> getSousaction();

	@Transactional
	public void deleteSousaction(Integer id);

	@Transactional(readOnly = true)
	public Sousaction searchSousaction(Integer id);

	@Transactional
	public Sousaction updateSousaction(Sousaction sousaction);
}