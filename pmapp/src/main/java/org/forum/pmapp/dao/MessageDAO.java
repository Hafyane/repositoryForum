package org.forum.pmapp.dao;

import org.forum.pmapp.entities.Message;
import org.springframework.stereotype.Repository;

@Repository("MessageDAO")
public class MessageDAO extends GenericJpaDAO<Message> {

	public MessageDAO() {
		super(Message.class);
	}

}
