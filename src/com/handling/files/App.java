package com.handling.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	public static void main(String[] args) {
//		fileHandling();

//		scannerInput();

//		stringTokenizer();

		stringPerformance();
	}

	static void fileHandling() {
//		try (FileWriter famousPersonQuotesFile = new FileWriter("famous-person-quotes.txt")) {
		try {
//			File famousQuotesFile = new File("famous-quotes.txt");
//			if (famousQuotesFile.createNewFile()) {
//				System.out.println("File created: " + 
//						famousQuotesFile.getName());
//			}

			File famousPersonQuotesFile = new File("famous-person-quotes.txt");
//			if (famousQuotesFile.renameTo(famousPersonQuotesFile)) {
//				System.out.println("File renamed to: " + 
//						famousPersonQuotesFile.getName());
//			}

//			if (famousPersonQuotesFile.delete()) {
//				System.out.println("File deleted: " + 
//						famousPersonQuotesFile.getName());
//			}

//			famousPersonQuotesFile.write("Hello, there. I'm in a high ground");
//			famousPersonQuotesFile.append("\nDon't underestimate me obi-wan.");
//			famousPersonQuotesFile.close();

			Scanner scanner = new Scanner(famousPersonQuotesFile);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				System.out.print(scanner.next());
			}
			scanner.close();

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
	}

	static void scannerInput() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to World of Warlords");
		System.out.println("Here you can create your character: ");

		System.out.print("Name: ");
		String name = userInput.nextLine();

		System.out.println("Race (human or orc): ");
		while (!userInput.hasNext("human") && !userInput.hasNext("orc")) {
			System.err.println("Invalid input, you need to type in human or orc.");
			userInput.nextLine();
		}
		String race = userInput.nextLine();

		System.out.println("Difficulty (0 - easy, 2 - hard): ");
		while (!userInput.hasNextByte(3)) {
			System.err.println("Invalid input, you need to type in 0 or 1 or 2.");
			userInput.nextLine();
		}
		byte difficulty = userInput.nextByte();

		System.out.println("Nightmare mode is on (true or false): ");
		while (!userInput.hasNextBoolean()) {
			System.err.println("Invalid input, you need to type in true or false.");
			userInput.nextLine();
		}
		boolean isNightmareModeOn = userInput.nextBoolean();

		System.out.println("-------------------------------");
		System.out.println("You character is created: ");
		System.out.printf("Name                    : %s\n", name);
		System.out.printf("Race                    : %s\n", race);
		System.out.printf("Difficulty              : %d\n", difficulty);
		System.out.printf("Nightmare mode is on    : %b\n", isNightmareModeOn);

		userInput.close();
	}

	static void stringPerformance() {
		long startTime = System.nanoTime();

//		String testString = "";
//		for (int i = 0; i <= 100000; i++) {
//			testString += i;
//		}

//		StringBuilder something = new StringBuilder("");
//		for (int i = 0; i <= 100000; i++) {
//			something.append(i);
//		}

//		StringBuffer anything = new StringBuffer("");
//		for (int i = 0; i <= 100000; i++) {
//			anything.append(i);
//		}

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("It took " + totalTime / 1000000 + "ms");
	}

	static void stringTokenizer() {
		String starWarsQuote = "May,the,force,be,with,you!";

		StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuote, ",");
		System.out.println("Number of tokens: " + stringTokenizer.countTokens());
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

		System.out.println();

		String[] starWarsQuoteWords = starWarsQuote.split(",", 3);
		System.out.println("Number of elements: " + starWarsQuoteWords.length);
		for (String starWarsQuoteWord : starWarsQuoteWords) {
			System.out.println(starWarsQuoteWord);
		}
	}
}
