package com.intermediate.sport;

public class FootballPlayer extends Athlete {

	private int passingYards;
	private int completions;

	public FootballPlayer(String name, String nickname, short yearOfBorn, String team, int gamesPlayed,
			int passingYards, int completions) {
		super(name, nickname, yearOfBorn, team, gamesPlayed);
		this.passingYards = passingYards;
		this.completions = completions;
	}

	public FootballPlayer(String name, short yearOfBorn, String team, int gamesPlayed, int passingYards,
			int completions) {
		super(name, yearOfBorn, team, gamesPlayed);
		this.passingYards = passingYards;
		this.completions = completions;
	}

	// Presentation view

	public void playGame(int passingYards, int completions) {
		super.playGame();
		this.passingYards += passingYards;
		this.completions += completions;
	}

	@Override
	public void printBiodata() {
		super.printBiodata();
		System.out.println("Completions (" + completions + ") - (" + passingYards + " yards)");
		System.out.println("----------------------------------");
	}

}
