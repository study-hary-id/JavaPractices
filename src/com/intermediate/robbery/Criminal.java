package com.intermediate.robbery;

public class Criminal extends Person {

	public static final int SUCCESS_PERCENTAGE = 20;

	public Criminal(String name, String nickname, String expertIn, Item[] items) {
		super(name, nickname, expertIn, items);
	}

	@Override
	public void printBioData() {
		System.out.println("Criminal:");
		super.printBioData();
	}

}
