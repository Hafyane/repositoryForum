package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Villeclt;
import org.springframework.stereotype.Repository;

@Repository("villecltDAO")
public class VillecltDAO extends GenericJpaDAO<Villeclt> {

	public VillecltDAO() {
		super(Villeclt.class);
	}

}
