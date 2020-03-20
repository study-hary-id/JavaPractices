package com.java.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public final class GameService {

	private static final String SRC_COM_ADVANCED_HANGMAN_WORDS_TXT = "src/com/advanced/hangman/words.txt";

	public static void start() {

		try (Scanner inputScanner = new Scanner(System.in)) {

			String randomWord = getRandomWord();
			int numberOfChances = randomWord.length();
			char[] randomWordArray = randomWord.toCharArray();
			char[] guessingArray = new char[randomWord.length()];

			Arrays.fill(guessingArray, '_');

			System.out.println("Starting the game");
			System.out.println("The length of the word and the number of chances: " + numberOfChances);

			while (true) {
				System.out.println("----------------------------------");
				System.out.print("Please type in a letter: ");

				String inputLine = inputScanner.nextLine().toLowerCase();
				char letter = inputLine.charAt(0);

				boolean isGuessingCorrect = false;
				for (int i = 0; i < randomWord.length(); i++) {
					if (letter == randomWordArray[i]) {
						guessingArray[i] = letter;
						isGuessingCorrect = true;
					}
				}

				if (isGuessingCorrect) {
					System.out.println("It was a good guess.");
					if (isGameFinished(guessingArray)) {
						System.out.println("----------------------------------");
						System.out.println("Congratulations you won! The word: " + new String(guessingArray) + ": "
								+ numberOfChances + " chances left");
						System.out.println("Ending the process");
						break;
					}
				} else {
					numberOfChances--;
					if (numberOfChances == 0) {
						System.out.println("Sorry you ran out of chances. The word was: " + randomWord);
						System.out.println("Ending the process");
						break;
					}
					System.out.println("Your number of chances is decreased to: " + numberOfChances);
					System.out.println("Try another letter!");
				}
				System.out.println("The word: " + new String(guessingArray));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static boolean isGameFinished(char[] guessingArray) {
		for (int i = 0; i < guessingArray.length; i++) {
			if (guessingArray[i] == '_') {
				return false;
			}
		}
		return true;
	}

	private static String getRandomWord() throws FileNotFoundException {
		List<String> words = getTheWords();
		Random randomNumberGenerator = new Random();
		int randomIndex = randomNumberGenerator.nextInt(words.size());

		return words.get(randomIndex);
	}

	private static List<String> getTheWords() throws FileNotFoundException {
		List<String> words = new ArrayList<>();

		File wordsFile = new File(SRC_COM_ADVANCED_HANGMAN_WORDS_TXT);
		Scanner wordScanner = new Scanner(wordsFile);
		while (wordScanner.hasNextLine()) {
			words.add(wordScanner.nextLine());
		}

		wordScanner.close();
		return words;
	}

}
