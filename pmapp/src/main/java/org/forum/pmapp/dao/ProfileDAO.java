package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Profile;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileDAO extends GenericJpaDAO<Profile> {

	public ProfileDAO() {
		super(Profile.class);
	}

}
