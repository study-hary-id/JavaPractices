package com.beginner.imdb;

public class App {

	public static void main(String[] args) {
		String actorFullname = "Tom Cruise";
		int currentYear = 2020;
		int yearOfBorn = 1962;
		int age = currentYear - yearOfBorn;

		String[] movieTitles = { "The Last Samurai", "American Made", "Top Gun", "Rain Man", "The Mummy" };

		float[] movieRatings = { 7.7F, 8.2F, 7.6F, 6.9F, 5.0F };

		// Output
		System.out.println("Actor's name: " + actorFullname);
		System.out.println("Born        : " + yearOfBorn + " (" + age + " years old)");
		System.out.println("Film        :");
		for (int i = 0; i < movieTitles.length; i++) {
			System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
		}
	}

	static String getRating(float rating) {
		if (rating <= 5.0) {
			return "Bad";
		} else if (rating > 5.0 && rating <= 6.5) {
			return "Average";
		} else if (rating > 6.5 && rating <= 7.0) {
			return "Good";
		} else if (rating > 7.0 && rating <= 8.0) {
			return "Awesome";
		} else {
			return "Amazing";
		}
	}

}
