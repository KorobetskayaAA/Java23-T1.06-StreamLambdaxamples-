package ru.teamscore.java23.t1_06.compareforstream.model;

public abstract class Client {
	private int ordersCount = 0;

	public int getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(int ordersCount) {
		this.ordersCount = ordersCount;
	}
}
