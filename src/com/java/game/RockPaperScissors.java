package com.java.game;

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
				System.out.println(userMove);
			}
		}

		inputScanner.close();
	}

	private static boolean isValidInput(String userInput) {
		return userInput.equals("rock") || userInput.equals("scissors") || userInput.equals("paper");
	}

}
