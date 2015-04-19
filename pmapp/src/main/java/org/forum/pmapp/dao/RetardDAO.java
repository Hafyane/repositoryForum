package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Retard;
import org.springframework.stereotype.Repository;

@Repository("retardDAO")
public class RetardDAO  extends GenericJpaDAO<Retard>
{

	public RetardDAO() {
		super(Retard.class);
	}

}
