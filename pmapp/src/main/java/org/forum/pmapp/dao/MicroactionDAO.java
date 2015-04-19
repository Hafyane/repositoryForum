package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Microaction;
import org.springframework.stereotype.Repository;

@Repository("MicroactionDAO")
public class MicroactionDAO extends GenericJpaDAO<Microaction>
{

	public MicroactionDAO() {
		super(Microaction.class);
	}
	

}
