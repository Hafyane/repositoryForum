package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Sousaction;
import org.springframework.stereotype.Repository;

@Repository("SousactionDAO")
public class SousactionDAO extends GenericJpaDAO<Sousaction>{

	public SousactionDAO() {
		super(Sousaction.class);
	}

}
