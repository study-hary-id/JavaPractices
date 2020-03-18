package com.handling.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
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

}
