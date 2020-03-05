package com.intermediate.sport;

import java.time.LocalDate;

public class Athlete {

	private String name;
	private String nickname;
	private short yearOfBorn;

	private String team;
	private int gamesPlayed;
//	private float pointsPerGame;

	public Athlete(String name, String nickname, short yearOfBorn, String team, int gamesPlayed) {
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.gamesPlayed = gamesPlayed;
	}

	public Athlete(String name, short yearOfBorn, String team, int gamesPlayed) {
		this.name = name;
		this.nickname = "None";
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.gamesPlayed = gamesPlayed;
	}

	public String getName() {
		return this.name;
	}

	private short calculateAge() {
		int currentYear = LocalDate.now().getYear();
		return (short) (currentYear - yearOfBorn);
	}

	// Presentation view

	public void printBiodata() {
		System.out.println("Athlete's name: " + name);
		System.out.println("Nickname      : " + nickname);
		System.out.println("Born          : " + yearOfBorn + " (" + calculateAge() + " years old)");
		System.out.println("Team          : " + team);

		System.out.println("----------------------------------");
		System.out.println(name + " has been played " + gamesPlayed + " times");
	}

}
