package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Contrainte;
import org.springframework.transaction.annotation.Transactional;


public interface IContrainteService 
{
	@Transactional
	public void addContrainte(Contrainte Contrainte);

	@Transactional(readOnly = true)
	public List<Contrainte> getContrainte();

	@Transactional
	public void deleteContrainte(Integer id);

	@Transactional(readOnly = true)
	public Contrainte searchContrainte(Integer id);
	
	@Transactional
	public Contrainte updateContrainte(Contrainte contrainte);
}