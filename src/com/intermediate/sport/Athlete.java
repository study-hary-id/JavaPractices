package com.intermediate.sport;

import java.time.LocalDate;

public abstract class Athlete {

	private String name;
	private String nickname;
	private short yearOfBorn;

	private String team;
	private int totalCompetitions;
//	private float pointsPerGame;

	public Athlete(String name, String nickname, short yearOfBorn, String team, int totalCompetitions) {
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.totalCompetitions = totalCompetitions;
	}

	public Athlete(String name, short yearOfBorn, String team, int totalCompetitions) {
		this.name = name;
		this.nickname = "None";
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.totalCompetitions = totalCompetitions;
	}

	// Controller

	public String getName() {
		return this.name;
	}

	public int getTotalCompetitions() {
		return this.totalCompetitions;
	}

	// TODO: is this method necessary.
	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	// Utilities

	private short calculateAge() {
		int currentYear = LocalDate.now().getYear();
		return (short) (currentYear - yearOfBorn);
	}

	// Presentation view

	public void compete() {
		System.out.println(name + " took part in a competition.");
		this.totalCompetitions++;
	}

	public void printBiodata() {
		System.out.println("Athlete's name: " + name);
		System.out.println("Nickname      : " + nickname);
		System.out.println("Born          : " + yearOfBorn + " (" + calculateAge() + " years old)");
		System.out.println("Team          : " + team);

		System.out.println("----------------------------------");
//		System.out.println(name + " has been played " + totalCompetitions + " times");
		System.out.println("Last team is " + team + " and took part in " + totalCompetitions + " competitions");
	}

	public abstract String getBodyType();

}
