package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Statutma;
import org.springframework.stereotype.Repository;
@Repository("StatutmaDAO")
public class StatutmaDAO extends GenericJpaDAO<Statutma>
{

	public StatutmaDAO() {
		super(Statutma.class);
	}
	

}
