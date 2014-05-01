package edu.services;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import edu.dao.ClientDAO;
import edu.entity.Client;

@Named
@Transactional
public class ClientService {
	@Inject
	private ClientDAO clientDAO;
	
	private void createClient(Client client){
		clientDAO.create(client);
	}
	
	private void deleteClient(Client client){
		clientDAO.delete(client);
	}
	
	private Client readClient(int id) {
		return clientDAO.readByID(id);
	}
	
	private void updateClient(Client client){
		clientDAO.update(client);
	}
 
	private void changePassword(){}
	
}
