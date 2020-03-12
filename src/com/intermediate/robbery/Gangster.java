package com.intermediate.robbery;

import java.util.Random;

public class Gangster {

	private final String NAME;
	private Criminal[] criminals;
	private double sumRobbedValue;
	private Random randomNumberGenerator = new Random();

	Gangster(String name, Criminal[] criminals) {
		this.NAME = name;
		this.criminals = criminals;
	}

	private boolean isSuccessfulRobbery() {
		int randomNumber = randomNumberGenerator.nextInt(101);
		int summarizedSuccessChange = Criminal.SUCCESS_PERCENTAGE * criminals.length;
		if (randomNumber >= summarizedSuccessChange) {
			return false;
		}
		return true;
	}

	public double getSumRobbedValue() {
		return this.sumRobbedValue;
	}

	public void printGangInfo() {
		System.out.println("---------------------------");
		System.out.println(NAME);
		for (Criminal criminal : criminals) {
			System.out.println("---------------------------");
			criminal.printBioData();
		}
	}

	public void letsRob(Building[] buildings) {
		int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length);
		System.out.println("---------------------------");
		if (isSuccessfulRobbery()) {
			System.out.println("The gang managed to rob the following items from the "
					+ buildings[randomBuildingIndex].getName() + ":");
			for (Item item : buildings[randomBuildingIndex].getItems()) {
				sumRobbedValue += item.getValue();
				System.out.println("- " + item.getName());
			}
		} else {
			System.out.println(
					"The gang tried to rob the " + buildings[randomBuildingIndex].getName() + " but they failed.");
		}
	}
}
