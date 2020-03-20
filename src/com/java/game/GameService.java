package com.java.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public final class GameService {

	private static final String SRC_COM_ADVANCED_HANGMAN_WORDS_TXT = "src/com/advanced/hangman/words.txt";

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
