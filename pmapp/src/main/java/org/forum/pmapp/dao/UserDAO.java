package org.forum.pmapp.dao;

import org.forum.pmapp.entities.User;
import org.springframework.stereotype.Repository;

@Repository("UserDAO")
public class UserDAO extends GenericJpaDAO<User> {

	public UserDAO() {
		super(User.class);
	}

}
