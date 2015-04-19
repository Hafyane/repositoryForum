package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Projet;
import org.springframework.stereotype.Repository;

@Repository
public class ProjetDAO extends GenericJpaDAO<Projet> 
{

	public ProjetDAO() {
		super(Projet.class);
	}

}
