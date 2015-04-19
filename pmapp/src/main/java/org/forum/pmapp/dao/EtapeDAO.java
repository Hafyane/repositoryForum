package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Etape;
import org.springframework.stereotype.Repository;

@Repository("EtapeDAO")
public class EtapeDAO extends GenericJpaDAO<Etape> {

	public EtapeDAO() {
		super(Etape.class);
	}

}
