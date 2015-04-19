package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Technologie;
import org.springframework.stereotype.Repository;

@Repository("TechnologieDAO")
public class TechnologieDAO extends GenericJpaDAO<Technologie>
{

	public TechnologieDAO() 
	{
		super(Technologie.class);
	}
	
	

}
