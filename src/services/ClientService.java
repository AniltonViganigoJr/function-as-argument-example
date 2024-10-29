package services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Client;

public class ClientService {

	public List<Client> checkPayment(List<Client> clients, Predicate<Client> criteria) {
		List<Client> activeClients = new ArrayList<>();
		for(Client c : clients) {
			if (criteria.test(c)){
				activeClients.add(c);
			}
		}
		return activeClients;
	}
}