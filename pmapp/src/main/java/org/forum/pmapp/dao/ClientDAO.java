package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Client;
import org.springframework.stereotype.Repository;

@Repository("ClientDAO")
public class ClientDAO extends GenericJpaDAO<Client> {

	public ClientDAO() {
		super(Client.class);
	}

}
