package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Statutprj;
import org.springframework.transaction.annotation.Transactional;

public interface IStatutprjService  
{
	
	@Transactional
	public void addStatutprj(Statutprj statutprj);

	@Transactional(readOnly = true)
	public List<Statutprj> getStatutprj();

	@Transactional
	public void deleteStatutprj(Integer id);

	@Transactional(readOnly = true)
	public Statutprj searchStatutprj(Integer id);

	@Transactional
	public Statutprj updateStatutprj(Statutprj statutprj);
	
}