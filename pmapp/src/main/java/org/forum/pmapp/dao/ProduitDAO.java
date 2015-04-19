package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Produit;
import org.springframework.stereotype.Repository;

@Repository("ProduitDAO")
public class ProduitDAO extends GenericJpaDAO<Produit> {

	public ProduitDAO() {
		super(Produit.class);
	}

}
