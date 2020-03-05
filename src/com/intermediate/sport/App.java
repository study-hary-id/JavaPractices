package com.intermediate.sport;

public class App {

	public static void main(String[] args) {

//		testInstantiateAthleteAndPrintBiodata();

//		testPrintBiodataBasketballPlayer();

		printAvailableBasketballPlayer();

//		testPrintBiodataFootballPlayer();

		printAvailableFootballPlayer();

	}

	static void testInstantiateAthleteAndPrintBiodata() {
		Athlete athlete = new Athlete("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346);
		athlete.printBiodata();
		System.out.println();

		Athlete athleteWithoutNickname = new Athlete("Earvin Johnson", (short) 1959, "Lakers", 906);
		athleteWithoutNickname.printBiodata();
	}

	static void testPrintBiodataBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, (float) 25.0);
		kobeBryant.printBiodata();
		System.out.println();

		BasketballPlayer KBWithoutNickname = new BasketballPlayer("Kobe Bryant", (short) 1978, "Lakers", 1346,
				(float) 83.7, (float) 25.0);
		KBWithoutNickname.printBiodata();
	}

	static void printAvailableBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, (float) 25.0);

		BasketballPlayer michaelJordan = new BasketballPlayer("Michael Jordan", "MJ", (short) 1963, "Chicago Bulls",
				1072, (float) 83.5, (float) 30.1);

		BasketballPlayer earvinJohnson = new BasketballPlayer("Earvin Johnson", "Magic", (short) 1959, "Lakers", 906,
				(float) 84.8, (float) 19.5);

		BasketballPlayer[] basketballPlayers = { kobeBryant, michaelJordan, earvinJohnson };
		printAthletesBiodata("Basketball Players", basketballPlayers);
	}

	static void testPrintBiodataFootballPlayer() {
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", "Tom Terrific", (short) 1977, "Tampa Bay", 285, 9988,
				6377);
		tomBrady.printBiodata();
		System.out.println();

		FootballPlayer TBWithoutNickname = new FootballPlayer("Tom Brady", (short) 1977, "Tampa Bay", 285, 9988, 6377);
		TBWithoutNickname.printBiodata();
	}

	static void printAvailableFootballPlayer() {
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", "Tom Terrific", (short) 1977, "Tampa Bay", 285, 9988,
				6377);

		FootballPlayer edBrady = new FootballPlayer("Ed Brady", "Ed Terrific", (short) 1979, "New England Patriots",
				265, 8988, 4377);

		FootballPlayer[] footballPlayers = { tomBrady, edBrady };
		printAthletesBiodata("Football Players", footballPlayers);
	}

	static void printAthletesBiodata(String sportsGroup, Athlete[] athletes) {
		System.out.println(sportsGroup + "\n");
		for (Athlete athlete : athletes) {
			athlete.printBiodata();
			System.out.println();
		}
	}

}
