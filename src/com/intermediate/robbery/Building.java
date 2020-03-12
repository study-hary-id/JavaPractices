package com.intermediate.robbery;

public class Building {

	private String name;
	private Item[] items;

	public Building(String name, Item[] items) {
		this.name = name;
		this.items = items;
	}

	public String getName() {
		return this.name;
	}

	public Item[] getItems() {
		return this.items;
	}

}
