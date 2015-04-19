package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Statutp;
import org.springframework.transaction.annotation.Transactional;

public interface IStatutpService 
{
	@Transactional
	public void addStatutp(Statutp statutp);

	@Transactional(readOnly = true)
	public List<Statutp> getStatutp();

	@Transactional
	public void deleteStatutp(Integer id);

	@Transactional(readOnly = true)
	public Statutp searchStatutp(Integer id);

	@Transactional
	public Statutp updateStatutp(Statutp statutp);
}