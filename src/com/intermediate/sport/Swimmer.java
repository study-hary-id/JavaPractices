package com.intermediate.sport;

public class Swimmer extends Athlete implements Swimming {

	private int finaPoints;

	public Swimmer(String name, String nickname, short yearOfBorn, String team, int totalCompetitions, int finaPoints) {
		super(name, nickname, yearOfBorn, team, totalCompetitions);
		this.finaPoints = finaPoints;
	}

	public Swimmer(String name, short yearOfBorn, String team, int totalCompetitions, int finaPoints) {
		super(name, yearOfBorn, team, totalCompetitions);
		this.finaPoints = finaPoints;
	}

	// Presentation view

	public void compete(int finaPoints) {
		super.compete();
		this.freestyle();
		this.finaPoints += finaPoints;
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println(super.getName() + " has " + finaPoints + " points");
		System.out.println("----------------------------------");
	}

	@Override
	public String getBodyType() {
		return "Lean muscle, long torso, and flexible angkles.";
	}

	@Override
	public void freestyle() {
		System.out.println("Swimming freestyle very fast.");
	}

}
