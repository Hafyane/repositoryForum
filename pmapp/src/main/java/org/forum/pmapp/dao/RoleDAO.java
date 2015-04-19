package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Role;
import org.springframework.stereotype.Repository;

@Repository("RoleDAO")
public class RoleDAO extends GenericJpaDAO<Role>
{
	public RoleDAO() {
		super(Role.class);
	}

}
