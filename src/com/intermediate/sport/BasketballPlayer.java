package com.intermediate.sport;

import java.util.Random;

public class BasketballPlayer extends Athlete {

	private float freeThrowPercentage;
	private float pointsPerGame;
	private int totalPoints;

	public BasketballPlayer(String name, String nickname, short yearOfBorn, String team, int gamesPlayed,
			float freeThrowPercentage, int totalPoints) {
		super(name, nickname, yearOfBorn, team, gamesPlayed);
		this.freeThrowPercentage = freeThrowPercentage;
		this.totalPoints = totalPoints;
		this.pointsPerGame = calculatePPG(totalPoints, gamesPlayed);
	}

	public BasketballPlayer(String name, short yearOfBorn, String team, int gamesPlayed, float freeThrowPercentage,
			int totalPoints) {
		super(name, yearOfBorn, team, gamesPlayed);
		this.freeThrowPercentage = freeThrowPercentage;
		this.totalPoints = totalPoints;
		this.pointsPerGame = calculatePPG(totalPoints, gamesPlayed);
	}

	// Controller

	public void setFreeThrowPercentage(float freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	// Utilities

	private float calculatePPG(int totalPoints, int gamesPlayed) {
		return (float) totalPoints / (float) gamesPlayed;
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

	public void playGame(int score) {
		super.playGame();
		this.freeThrow();
		this.totalPoints += score;
		this.pointsPerGame = calculatePPG(totalPoints, super.getGamesPlayed());
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println("With (FTP " + freeThrowPercentage + "%) - (PPG " + pointsPerGame + ")");
		System.out.println("----------------------------------");
	}

}
