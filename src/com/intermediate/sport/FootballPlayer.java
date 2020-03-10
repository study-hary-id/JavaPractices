package com.intermediate.sport;

public class FootballPlayer extends Athlete {

	private int passingYards;
	private int completions;

	public FootballPlayer(String name, String nickname, short yearOfBorn, String team, int totalCompetitions,
			int passingYards, int completions) {
		super(name, nickname, yearOfBorn, team, totalCompetitions);
		this.passingYards = passingYards;
		this.completions = completions;
	}

	public FootballPlayer(String name, short yearOfBorn, String team, int totalCompetitions, int passingYards,
			int completions) {
		super(name, yearOfBorn, team, totalCompetitions);
		this.passingYards = passingYards;
		this.completions = completions;
	}

	// Presentation view

	public void compete(int passingYards, int completions) {
		super.compete();
		this.passingYards += passingYards;
		this.completions += completions;
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println("Completions (" + completions + ") - (" + passingYards + " yards)");
		System.out.println("----------------------------------");
	}

	@Override
	public String getBodyType() {
		return "Big muscles and great endurance";
	}

}
