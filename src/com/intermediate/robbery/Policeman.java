package com.intermediate.robbery;

public class Policeman extends Person {

	public static final int SUCCESS_PERCENTAGE = 10;

	public Policeman(String name, String nickname, String expertIn, Item[] items) {
		super(name, nickname, expertIn, items);
	}

	@Override
	public void printBioData() {
		System.out.println("Policeman:");
		super.printBioData();
	}

}
