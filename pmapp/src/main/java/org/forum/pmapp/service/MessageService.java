package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Message;
import org.springframework.stereotype.Service;

@Service("MessageService")
public class MessageService implements IMessageService
{

	@Override
	public void addMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Message> getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMessage(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message searchMessage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message updateMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}
}