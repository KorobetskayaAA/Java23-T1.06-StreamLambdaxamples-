package ru.teamscore.java23.t1_06.compareforstream.service;

import java.util.Arrays;
import java.util.Comparator;

import ru.teamscore.java23.t1_06.compareforstream.model.*;

public class TopClientsServiceFor extends TopClientsService {

	public TopClientsServiceFor(Client[] clients) {
		super(clients);
	}

	// TODO decompose method!
	@Override
	public String getTopPersons() {
		// Get person clients count
		int personsCount = 0;
		for (Client client : clients) {
			if (client instanceof PersonClient) {
				personsCount++;
			}
		}
		// Filter person clients from all clients
		PersonClient[] personClients = new PersonClient[personsCount];
		int i = 0;
		for (Client client : clients) {
			if (client instanceof PersonClient) {
				personClients[i++] = (PersonClient)client;
			}
		}
		// Sort person clients by order count
		Arrays.sort(personClients, Comparator.comparing(PersonClient::getOrdersCount));
		// Get first TOP from sorted clients and map them to desired strings
		int topPersonsCount = personsCount > TOP_COUNT ? TOP_COUNT : personsCount;
		String[] result = new String[topPersonsCount];
		for (int j = 0; j < topPersonsCount; j++) {
			PersonClient pc = personClients[j];
			result[j] = String.format("%s\t%s", pc.getFullName(), pc.getPhone());
		}
		// return joined result
		return String.join("\n", result);
	}
}
