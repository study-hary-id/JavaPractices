package com.intermediate.robbery;

public abstract class Person {

	private static int numberOfPerson = 0;

	private String name;
	private String nickname;
	private String expertIn;
	private Item[] items;

	public Person(String name, String nickname, String expertIn, Item[] items) {
		this.name = name;
		this.nickname = nickname;
		this.expertIn = expertIn;
		this.items = items;

		Person.numberOfPerson++;
	}

	public String getName() {
		return this.name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public String getExpertIn() {
		return this.expertIn;
	}

	public Item[] getItems() {
		return this.items;
	}

	public static int getNumberOfPerson() {
		return Person.numberOfPerson;
	}

	// Presentation view

	public void printBioData() {
		System.out.println("Name: " + name + " (" + nickname + ")");
		System.out.println("Expert in: " + expertIn);
		System.out.println("The person has the following items:");
		for (Item item : items) {
			System.out.println("    - " + item.getName());
		}
	}

}
