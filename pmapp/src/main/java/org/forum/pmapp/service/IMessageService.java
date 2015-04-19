package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Message;
import org.springframework.transaction.annotation.Transactional;


public interface IMessageService 
{
	@Transactional
	public void addMessage(Message message);

	@Transactional(readOnly = true)
	public List<Message> getMessage();

	@Transactional
	public void deleteMessage(Integer id);

	@Transactional(readOnly = true)
	public Message searchMessage(Integer id);

	@Transactional
	public Message updateMessage(Message message);
	
}