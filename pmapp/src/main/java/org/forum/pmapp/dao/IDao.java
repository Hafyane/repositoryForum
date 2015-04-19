package org.forum.pmapp.dao;

import java.util.List;


public interface IDao<T> 
{
	public void save(T entity);
	public List<T> getAll();
	public void delete(Integer id);
	public T findbyid(Integer id);
	public T update(T entity);
	
}
