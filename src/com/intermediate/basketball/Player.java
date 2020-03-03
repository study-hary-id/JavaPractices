package com.intermediate.basketball;

import java.util.Random;
import java.time.LocalDate;

public class Player {

	private String name;
	private String nickname;
	private short yearOfBorn;

	private String team;

	private float freeThrowPercentage;
	private byte pointsPerGame;
	private int gamesPlayed;

	public Player(String name, String nickname, short yearOfBorn, String team, float freeThrowPercentage,
			byte pointsPerGame, int gamesPlayed) {
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.freeThrowPercentage = freeThrowPercentage;
		this.pointsPerGame = pointsPerGame;
		this.gamesPlayed = gamesPlayed;
	}

	public Player(String name, short yearOfBorn, String team, float freeThrowPercentage, byte pointsPerGame,
			int gamesPlayed) {
		this.name = name;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.freeThrowPercentage = freeThrowPercentage;
		this.pointsPerGame = pointsPerGame;
		this.gamesPlayed = gamesPlayed;
	}

	private short calculateAge() {
		int currentYear = LocalDate.now().getYear();
		return (short) (currentYear - yearOfBorn);
	}

	// Presentation view

	public void freeThrow() {
		Random randomNumberGenerator = new Random();
		if ((randomNumberGenerator.nextFloat() * 100) > freeThrowPercentage) {
			System.out.println(name + " failed to score free throw.");
		} else {
			System.out.println(name + " scored free throw.");
		}
	}

	public void printPlayerInfo() {
		System.out.println("Athlete's name: " + name);
		System.out.println("Nickname      : " + nickname);
		System.out.println("Born          : " + yearOfBorn + " (" + calculateAge() + " years old)");
		System.out.println("Team          : " + team);

		System.out.println("--------------------------------------");
		System.out.println(name + " has been played " + gamesPlayed + " times");
		System.out.println("With (FTP " + freeThrowPercentage + "%) (PPG " + pointsPerGame + ")");
		System.out.println("--------------------------------------");
	}

}
