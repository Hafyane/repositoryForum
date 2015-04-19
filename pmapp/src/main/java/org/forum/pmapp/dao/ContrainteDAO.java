package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Contrainte;
import org.springframework.stereotype.Repository;

@Repository("ContrainteDAO")
public class ContrainteDAO extends GenericJpaDAO<Contrainte> {

	public ContrainteDAO() {
		super(Contrainte.class);
	}

}
