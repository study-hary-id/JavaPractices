package com.intermediate.robbery;

import java.util.Random;

public class Police {

	private final String NAME;
	private Detective detective;
	private Policeman[] policeman;

	Police(String name, Detective detective, Policeman[] policeman) {
		this.NAME = name;
		this.detective = detective;
		this.policeman = policeman;
	}

	private int calculateSuccessPercentage() {
		int totalSuccessPercentage = 0;
		totalSuccessPercentage += Detective.SUCCESS_PERCENTAGE;
		totalSuccessPercentage += Policeman.SUCCESS_PERCENTAGE * policeman.length;
		return totalSuccessPercentage;
	}

	private boolean areCriminalsCaught() {
		Random randomNumberGenerator = new Random();
		if (randomNumberGenerator.nextInt() >= calculateSuccessPercentage()) {
			return false;
		}
		return true;
	}

	private void shoutoutMembers() {
		System.out.println("---------------------------");
		System.out.println(NAME);
		System.out.println("---------------------------");
		detective.printBioData();
		for (Policeman police : policeman) {
			System.out.println("---------------------------");
			police.printBioData();
		}
	}

	public boolean catchCriminals(Gangster gangster) {
		if (areCriminalsCaught()) {
			System.out.println(detective.getName() + " managed to catch the gang");

			if (gangster.getSumRobbedValue() > 0) {
				System.out.println("The stolen items are recovered.");
				System.out.println("Their overall value is estimated to $" + gangster.getSumRobbedValue());
			} else {
				System.out.println("The gang couldn't steal anything.");
			}

			shoutoutMembers();
			gangster.printGangInfo();
			return true;
		} else {
			System.out.println(detective.getName() + " couldn't catch the criminals.");
			System.out.println("They managed to steal items valued $" + gangster.getSumRobbedValue());
			return false;
		}
	}

}
