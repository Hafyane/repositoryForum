package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Phase;
import org.springframework.stereotype.Repository;

@Repository("PhaseDAO")
public class PhaseDAO extends GenericJpaDAO<Phase>
{
	public PhaseDAO() {
		super(Phase.class);
	}

}
