package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Entite;
import org.springframework.stereotype.Repository;

@Repository("EntiteDAO")
public class EntiteDAO extends GenericJpaDAO<Entite> {

	public EntiteDAO() {
		super(Entite.class);
	}

}
