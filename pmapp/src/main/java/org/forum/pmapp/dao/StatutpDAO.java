package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Statutp;
import org.springframework.stereotype.Repository;

@Repository("StatutpDAO")
public class StatutpDAO extends GenericJpaDAO<Statutp> {

	public StatutpDAO() {
		super(Statutp.class);
	}

}
