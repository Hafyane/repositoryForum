package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Action;
import org.springframework.stereotype.Repository;

@Repository("ActionDAO")
public class ActionDAO extends GenericJpaDAO<Action> {

	public ActionDAO() {
		super(Action.class);
	}

}
