package org.forum.pmapp.service;

import java.util.List;
import org.forum.pmapp.entities.Action;
import org.springframework.transaction.annotation.Transactional;


public interface IActionService 
{
	@Transactional
	public void addAction(Action action);

	@Transactional(readOnly = true)
	public List<Action> getAction();

	@Transactional
	public void deleteAction(Integer id);

	@Transactional(readOnly = true)
	public Action searchAction(Integer id);
	
	@Transactional
	public Action updateAction(Action action);
}