package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Statutprj;
import org.springframework.stereotype.Repository;


@Repository("StatutprjDAO")
public class StatutprjDAO extends GenericJpaDAO<Statutprj> {

	public StatutprjDAO() 
	{
		super(Statutprj.class);
	}
	
	

}
