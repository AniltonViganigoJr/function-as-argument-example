package application;

import java.util.ArrayList;
import java.util.List;

import entities.Client;
import enums.Degree;
import services.ClientService;

public class Program {

	public static void main(String[] args) {

		List<Client> clients = new ArrayList<>();
		
		clients.add(new Client("Daniel da Voz", true, Degree.BLACK));
		clients.add(new Client("César Munhoz Velaz", false, Degree.PURPLE));
		clients.add(new Client("Nícolas do Lago", false, Degree.BLUE));
		clients.add(new Client("Tereza Cavalcante", true, Degree.BROWN));
		clients.add(new Client("Thiago Gomez", true, Degree.BLUE));
		
		ClientService clientService = new ClientService();
		
		List<Client> activeClients = clientService.checkPayment(clients, c -> c.getMonthlyFeePaid());
		
		System.out.println("***Active Clients***");
		
		activeClients.forEach(System.out::println);
	}
}