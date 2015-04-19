package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Statutma;
import org.springframework.transaction.annotation.Transactional;


public interface IStatutmaService 
{
	@Transactional
	public void addStatutma(Statutma statutma);

	@Transactional(readOnly = true)
	public List<Statutma> getStatutma();

	@Transactional
	public void deleteStatutma(Integer id);

	@Transactional(readOnly = true)
	public Statutma searchStatutma(Integer id);

	@Transactional
	public Statutma updateStatutma(Statutma statutma);
}