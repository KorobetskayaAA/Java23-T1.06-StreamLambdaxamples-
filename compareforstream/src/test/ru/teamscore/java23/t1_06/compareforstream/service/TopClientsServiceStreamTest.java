package ru.teamscore.java23.t1_06.compareforstream.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import ru.teamscore.java23.t1_06.compareforstream.model.*;

class TopClientsServiceStreamTest {

	@Test
	void testGetTopPersons() {
		Random rnd = new Random(100);
		Client[] clients = new Client[20];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = rnd.nextDouble() < 0.6 
					? new PersonClient("Person " + i, String.format("999000000", i)) 
							: new FirmClient("Firm " + i, String.format("1230000000000", i));
			clients[i].setOrdersCount(rnd.nextInt(10, 100));
		};

		var forService = new TopClientsServiceFor(clients);
		var streamService = new TopClientsServiceStream(clients);
		
		assertEquals(forService.getTopPersons(), streamService.getTopPersons());
	}

}
