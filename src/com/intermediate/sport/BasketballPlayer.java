package com.intermediate.sport;

import java.util.Random;

public class BasketballPlayer extends Athlete {

	private float freeThrowPercentage;
	private float pointsPerGame;

	public BasketballPlayer(String name, String nickname, short yearOfBorn, String team, int gamesPlayed,
			float freeThrowPercentage, float pointsPerGame) {
		super(name, nickname, yearOfBorn, team, gamesPlayed);
		this.freeThrowPercentage = freeThrowPercentage;
		this.pointsPerGame = pointsPerGame;
	}

	public BasketballPlayer(String name, short yearOfBorn, String team, int gamesPlayed, float freeThrowPercentage,
			float pointsPerGame) {
		super(name, yearOfBorn, team, gamesPlayed);
		this.freeThrowPercentage = freeThrowPercentage;
		this.pointsPerGame = pointsPerGame;
	}

	// Presentation view

	public void freeThrow() {
		Random randomNumberGenerator = new Random();
		if ((randomNumberGenerator.nextFloat() * 100) > freeThrowPercentage) {
			System.out.println(super.getName() + " failed to score free throw.");
		} else {
			System.out.println(super.getName() + " scored free throw.");
		}
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println("With (FTP " + freeThrowPercentage + "%) - (PPG " + pointsPerGame + ")");
		System.out.println("----------------------------------");
	}

}
