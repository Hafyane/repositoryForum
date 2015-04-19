package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Villeusr;
import org.springframework.stereotype.Repository;

@Repository("VilleusrDAO")
public class VilleusrDAO extends GenericJpaDAO<Villeusr>
{

	public VilleusrDAO() {
		super(Villeusr.class);
	}
	

}
