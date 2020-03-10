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

//		testUnitControllerSwimmerImpl();
//		testPrintBiodataSwimmerImpl();
//		testUnitControllerAthlete();

	}

	static void testInstantiateAthleteAndPrintBiodata() {
//		Athlete athlete = new Athlete("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346);
//		athlete.printBiodata();
//		System.out.println();
//		
//		Athlete athleteWithoutNickname = new Athlete(
//				"Earvin Johnson", (short) 1959, "Lakers", 906 
//		);
//		athleteWithoutNickname.printBiodata();
	}

	static void testUnitControllerBasketballPlayer() {
		BasketballPlayer kobeBryant = new BasketballPlayer("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346,
				(float) 83.7, 33650);

		kobeBryant.compete();
		System.out.println(kobeBryant.getTotalCompetitions() == 1347);
		System.out.println("----");

		// Calls BasketballPlayer's own playGame method.
		// Expected changes:
		// gamesPlayed attributes,
		// totalPoints attributes,
		// pointsPerGame attributes.
		kobeBryant.compete(45);
		int gamesPlayed = kobeBryant.getTotalCompetitions();
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

		tomBrady.compete();
		System.out.println(tomBrady.getTotalCompetitions() == 286);
		System.out.println("----");

		// Calls FootballPlayer's own playGame method.
		// Expected changes:
		// gamesPlayed attributes,
		// passingYards attributes,
		// completions attributes.
		tomBrady.compete(1000, 700);
		int gamesPlayed = tomBrady.getTotalCompetitions();
		System.out.println(gamesPlayed == 287);
		System.out.println("----");

		tomBrady.printBiodata();
		System.out.println("Test: competitions: it should be " + gamesPlayed);
		System.out.println("Test: completions : it should be " + (6377 + 700));
		System.out.println("Test: passingYards: it should be " + (9988 + 1000));
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

	static void testUnitControllerSwimmerImpl() {
		Swimmer katinkaHosszu = new Swimmer("Katinka Hosszu", "Iron lady", (short) 1989, "Team Iron", 542, 845);

		katinkaHosszu.compete();
		System.out.println(katinkaHosszu.getTotalCompetitions() == 543);
		System.out.println("----");

		// Calls Swimmer's own playGame method.
		// Expected changes:
		// gamesPlayed attributes,
		// finaPoints attributes.
		katinkaHosszu.compete(845);
		int gamesPlayed = katinkaHosszu.getTotalCompetitions();
		System.out.println(gamesPlayed == 544);
		System.out.println("----");

		katinkaHosszu.printBiodata();
		System.out.println("Test: competitions: it should be " + gamesPlayed);
		System.out.println("Test: finaPoints  : it should be " + (845 * 2));
	}

	static void testPrintBiodataSwimmerImpl() {
		Swimmer katinkaHosszu = new Swimmer("Katinka Hosszu", "Iron lady", (short) 1989, "Team Iron", 542, 845);
		katinkaHosszu.printBiodata();
		System.out.println();

		Swimmer KHWithoutNickname = new Swimmer("Katinka Hosszu", (short) 1989, "Team Iron", 542, 845);
		KHWithoutNickname.printBiodata();
	}

	static void testUnitControllerAthlete() {
//		Athlete athlete = new Athlete("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", 1346);
//		
//		System.out.println(athlete.getName() == "Kobe Bryant");
//		
//		System.out.println(athlete.getTotalCompetitions() == 1346);
//		
//		System.out.println(athlete.getTeam() == "Lakers");
//		
//		// Update team with setter.
//		athlete.setTeam("Chicago Bulls");
//		System.out.println(athlete.getTeam() == "Chicago Bulls");
//		
//		// Update gamesPlayed attribute with increment.
//		athlete.compete();
//		System.out.println(athlete.getTotalCompetitions() == 1347);
	}

	static void printAthletesBiodata(String sportsGroup, Athlete[] athletes) {
		System.out.println(sportsGroup + "\n");
		for (Athlete athlete : athletes) {
			athlete.printBiodata();
			System.out.println();
		}
	}

}
