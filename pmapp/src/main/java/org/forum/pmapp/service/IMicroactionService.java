package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Microaction;
import org.springframework.transaction.annotation.Transactional;

public interface IMicroactionService {
	@Transactional
	public void addMicroaction(Microaction microaction);

	@Transactional(readOnly = true)
	public List<Microaction> getMicroaction();

	@Transactional
	public void deleteMicroaction(Integer id);

	@Transactional(readOnly = true)
	public Microaction searchMicroaction(Integer id);

	@Transactional
	public Microaction updateMicroaction(Microaction microaction);
}