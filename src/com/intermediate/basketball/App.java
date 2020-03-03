package com.intermediate.basketball;

public class App {

	public static void main(String[] args) {
		Player kobeBryant = new Player("Kobe Bryant", "Black Mamba", (short) 1978, "Lakers", (float) 83.7, (byte) 25,
				1346);

		Player michaelJordan = new Player("Michael Jordan", "MJ", (short) 1963, "Chicago Bulls", (float) 83.5,
				(byte) 30, 1072);

		Player earvinJohnson = new Player("Earvin Johnson", "Magic", (short) 1959, "Lakers", (float) 84.8, (byte) 19,
				906);

		Player[] basketballPlayers = { kobeBryant, michaelJordan, earvinJohnson };
		for (Player player : basketballPlayers) {
			player.printPlayerInfo();
			player.freeThrow();

			System.out.println();
		}
	}

}
