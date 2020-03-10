package com.intermediate.sport;

public class App {

	public static void main(String[] args) {

//		testInstantiateAthleteAndPrintBiodata();

//		testUnitControllerBasketballPlayer();
//		testPrintBiodataBasketballPlayer();
//		printAvailableBasketballPlayer();

//		testUnitControllerFootballPlayer();
//		testPrintBiodataFootballPlayer();
//		printAvailableFootballPlayer();

//		testUnitControllerAthlete();

	}

	static void testInstantiateAthleteAndPrintBiodata() {
		Athlete athlete = new Athlete("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346);
		athlete.printBiodata();
		System.out.println();

		Athlete athleteWithoutNickname = new Athlete("Earvin Johnson", (short) 1959, "Lakers", 906);
		athleteWithoutNickname.printBiodata();
	}

	static void testUnitControllerBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, 33650);

		kobeBryant.playGame();
		System.out.println(kobeBryant.getGamesPlayed() == 1347);
		System.out.println("----");

		// Calls BasketballPlayer's own playGame method.
		// Expected changes:
		// gamesPlayed attributes,
		// totalPoints attributes,
		// pointsPerGame attributes.
		kobeBryant.playGame(45);
		int gamesPlayed = kobeBryant.getGamesPlayed();
		System.out.println(gamesPlayed == 1348);
		System.out.println("----");

		kobeBryant.setFreeThrowPercentage(82.5f);
		kobeBryant.printBiodata();

		float PPG = (float) (33650 + 45) / (float) gamesPlayed;
		System.out.println("Test: GP : it should be " + gamesPlayed);
		System.out.println("Test: FTP: it should be " + 82.5f);
		System.out.println("Test: PPG: it should be " + PPG);
	}

	static void testPrintBiodataBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, 33650);
		kobeBryant.printBiodata();
		System.out.println();

		BasketballPlayer KBWithoutNickname = new BasketballPlayer("Kobe Bryant", (short) 1978, "Lakers", 1346,
				(float) 83.7, 33650);
		KBWithoutNickname.printBiodata();
	}

	static void printAvailableBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, 33650);

		BasketballPlayer michaelJordan = new BasketballPlayer("Michael Jordan", "MJ", (short) 1963, "Chicago Bulls",
				1072, (float) 83.5, 32268);

		BasketballPlayer earvinJohnson = new BasketballPlayer("Earvin Johnson", "Magic", (short) 1959, "Lakers", 906,
				(float) 84.8, 17667);

		BasketballPlayer[] basketballPlayers = { kobeBryant, michaelJordan, earvinJohnson };
		printAthletesBiodata("Basketball Players", basketballPlayers);
	}

	static void testUnitControllerFootballPlayer() {
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", "Tom Terrific", (short) 1977, "Tampa Bay", 285, 9988,
				6377);

		tomBrady.playGame();
		System.out.println(tomBrady.getGamesPlayed() == 286);
		System.out.println("----");

		// Calls FootballPlayer's own playGame method.
		// Expected changes:
		// gamesPlayed attributes,
		// passingYards attributes,
		// completions attributes.
		tomBrady.playGame(1000, 700);
		int gamesPlayed = tomBrady.getGamesPlayed();
		System.out.println(gamesPlayed == 287);
		System.out.println("----");

		tomBrady.printBiodata();
		System.out.println("Test: gamesPlayed : it should be " + gamesPlayed);
		System.out.println("Test: passingYards: it should be " + (9988 + 1000));
		System.out.println("Test: completions : it should be " + (6377 + 700));
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

	static void testUnitControllerAthlete() {
		Athlete athlete = new Athlete("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346);

		System.out.println(athlete.getName() == "Kobe Bryant");

		System.out.println(athlete.getGamesPlayed() == 1346);

		System.out.println(athlete.getTeam() == "Lakers");

		// Update team with setter.
		athlete.setTeam("Chicago Bulls");
		System.out.println(athlete.getTeam() == "Chicago Bulls");

		// Update gamesPlayed attribute with increment.
		athlete.playGame();
		System.out.println(athlete.getGamesPlayed() == 1347);
	}

	static void printAthletesBiodata(String sportsGroup, Athlete[] athletes) {
		System.out.println(sportsGroup + "\n");
		for (Athlete athlete : athletes) {
			athlete.printBiodata();
			System.out.println();
		}
	}

}
