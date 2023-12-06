package ru.teamscore.java23.t1_06.compareforstream.model;

public class FirmClient extends Client {
	
	public FirmClient(String title, String inn) {
		super();
		this.title = title;
		this.inn = inn;
	}

	private String title;
	private String inn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}
}
