package ru.teamscore.java23.t1_06.compareforstream.service;

import ru.teamscore.java23.t1_06.compareforstream.model.*;

public abstract class TopClientsService {
	public TopClientsService(Client[] clients) {
		this.clients = clients;
	}
	public int TOP_COUNT = 10;
	protected final Client[] clients;
	public abstract String getTopPersons();
}
