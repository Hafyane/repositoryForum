package org.forum.pmapp.service;

import java.util.List;

import org.forum.pmapp.entities.Client;
import org.springframework.transaction.annotation.Transactional;


public interface IClientService 
{
	@Transactional
	public void addClient(Client client);

	@Transactional(readOnly = true)
	public List<Client> getClient();

	@Transactional
	public void deleteClient(Integer id);

	@Transactional(readOnly = true)
	public Client searchClient(Integer id);
	
	@Transactional
	public Client updateClient(Client client);
	
}