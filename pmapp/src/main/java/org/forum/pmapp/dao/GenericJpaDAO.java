package org.forum.pmapp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

public class GenericJpaDAO<T> implements IDao<T> {

	@PersistenceContext(unitName = "projetForum", type = PersistenceContextType.EXTENDED)
	private EntityManager em;

	private Class<T> entityClass;

	public GenericJpaDAO(Class entity) {
		this.entityClass = entity;
	}

	@Override
	public void save(T entity) {
		em.persist(entity);
	}

	@Override
	public List<T> getAll() {
		Query qry = em.createQuery("select obj from " + entityClass.getName()
				+ " obj");

		return qry.getResultList();
	}

	@Override
	public void delete(Integer entityID) {

		T entityToBeRemoved = em.find(this.entityClass, entityID);
		em.remove(entityToBeRemoved);
	}

	@Override
	public T findbyid(Integer entityID) {

		return em.find(entityClass, entityID);

	}

	@Override
	public T update(T entity) {
		return em.merge(entity);
	}

}
