package com.intermediate.sport;

import java.util.Random;

public class BasketballPlayer extends Athlete {

	private float freeThrowPercentage;
	private float pointsPerGame;
	private int totalPoints;

	public BasketballPlayer(String name, String nickname, short yearOfBorn, String team, int totalCompetitions,
			float freeThrowPercentage, int totalPoints) {
		super(name, nickname, yearOfBorn, team, totalCompetitions);
		this.freeThrowPercentage = freeThrowPercentage;
		this.totalPoints = totalPoints;
		this.pointsPerGame = calculatePPG(totalPoints, totalCompetitions);
	}

	public BasketballPlayer(String name, short yearOfBorn, String team, int totalCompetitions,
			float freeThrowPercentage, int totalPoints) {
		super(name, yearOfBorn, team, totalCompetitions);
		this.freeThrowPercentage = freeThrowPercentage;
		this.totalPoints = totalPoints;
		this.pointsPerGame = calculatePPG(totalPoints, totalCompetitions);
	}

	// Controller

	public void setFreeThrowPercentage(float freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	// Utilities

	private float calculatePPG(int totalPoints, int totalCompetitions) {
		return (float) totalPoints / (float) totalCompetitions;
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

	public void compete(int score) {
		super.compete();
		this.freeThrow();
		this.totalPoints += score;
		this.pointsPerGame = calculatePPG(totalPoints, super.getTotalCompetitions());
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println("With (FTP " + freeThrowPercentage + "%) - (PPG " + pointsPerGame + ")");
		System.out.println("----------------------------------");
	}

	@Override
	public String getBodyType() {
		return "Tall and lean muscle";
	}

}
