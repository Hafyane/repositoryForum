package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Fournisseur;
import org.springframework.stereotype.Repository;

@Repository("FournisseurDAO")
public class FournisseurDAO extends GenericJpaDAO<Fournisseur>
{

	public FournisseurDAO() {
		super(Fournisseur.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
