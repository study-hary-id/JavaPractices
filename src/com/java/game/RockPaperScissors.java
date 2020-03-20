package com.java.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors!");

		while (true) {
			System.out.println("To make a move type in rock or paper or scissors. To quit the game enter quit.");

			System.out.print("Your move: ");
			String userMove = inputScanner.nextLine().toLowerCase();

			if (userMove.equals("quit")) {
				break;
			}

			if (isValidInput(userMove)) {
				String opponentMove = generateOpponentMove();
				System.out.println("Your opponent's move: " + opponentMove);
				start(userMove, opponentMove);

			} else {
				System.out.println("Your input is not valid");
			}
			System.out.println();
		}

		inputScanner.close();
	}

	private static boolean isValidInput(String userInput) {
		return userInput.equals("rock") || userInput.equals("scissors") || userInput.equals("paper");
	}

	private static String generateOpponentMove() {
		Random randomNumberGenerator = new Random();
		switch (randomNumberGenerator.nextInt(3)) {
		case 0:
		default:
			return "rock";
		case 1:
			return "paper";
		case 2:
			return "scissors";
		}
	}

	private static void start(String userMove, String opponentMove) {
		if (userMove.equals(opponentMove)) {
			System.out.println("It's a tie.");
		} else if (userMove.equals("paper") && opponentMove.equals("rock")
				|| userMove.equals("rock") && opponentMove.equals("scissors")
				|| userMove.equals("scissors") && opponentMove.equals("paper")) {
			System.out.println("You won!");
		} else {
			System.out.println("Your opponent won!");
		}
	}

}
