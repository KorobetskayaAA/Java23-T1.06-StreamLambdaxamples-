package ru.teamscore.java23.t1_06.compareforstream.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import ru.teamscore.java23.t1_06.compareforstream.model.*;

public class TopClientsServiceStream extends TopClientsService {

	public TopClientsServiceStream(Client[] clients) {
		super(clients);
	}

	@Override
	public String getTopPersons() {
		var streamClients = Arrays.stream(clients)
				.filter(c -> c instanceof PersonClient)
				.map(c -> (PersonClient)c)
				.sorted(Comparator.comparing(PersonClient::getOrdersCount))
				.limit(TOP_COUNT)
				.map(pc -> String.format("%s\t%s", pc.getFullName(), pc.getPhone()));
		String[] tops = streamClients
				.toArray(String[]::new);
		List<String> topsList = streamClients
				.toList();
		return String.join("\n", tops);
	}
}
