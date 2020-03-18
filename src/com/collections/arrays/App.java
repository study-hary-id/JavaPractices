package com.collections.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {

	}

	static void cart() {
		ArrayList<Product> cart = new ArrayList<>();

		cart.add(new Product("Fidget spinner", 3.99, "It's fun."));
		cart.add(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof."));
		cart.add(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof."));
		cart.add(1, new Product("36 AAA batteries", 10.99, "High-performance alkaline batteries."));

		cart.remove(2);
//		products.remove(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof."));

		cart.set(0, new Product("Rubber duck", 5.99, "You can't have bath without this."));

//		for (Product product : cart) {
//			System.out.println(product);
//		}

		System.out.println("The third element in the list:");
		System.out.println(cart.get(2));

		System.out.println(cart.size() + " products can be found in the cart.");
	}

	static void todo() {
		ArrayList<String> urgentTasks = new ArrayList<>();
		ArrayList<String> allTasks = new ArrayList<>();

		urgentTasks.add("Repairing the car");
		urgentTasks.add("Paying the checks");

		allTasks.add("Mowing the lawn");
		allTasks.add("Cleaning the bathroom");
		allTasks.add("Going to the grocery store");

		Collections.swap(urgentTasks, 0, 1);
//		urgentTasks.clear();

		if (!urgentTasks.isEmpty()) {
			System.out.println("Urgent tasks:");
			for (String task : urgentTasks) {
				System.out.println("- " + task);
			}
		}

		allTasks.addAll(urgentTasks);
		Collections.sort(allTasks, Collections.reverseOrder());

		System.out.println("All tasks:");
		for (String task : allTasks) {
			System.out.println("- " + task);
		}

		System.out.println("--------------------------------------");
		if (allTasks.contains("Cleaning the bathroom")) {
			System.out.println("I haven't cleaned the bathroom");
		}

		System.out.println("--------------------------------------");
		System.out.println("The first 3 most important tasks:");
		for (String task : allTasks.subList(0, 3)) {
			System.out.println("- " + task);
		}

		Collections.shuffle(allTasks);
		System.out.println("--------------------------------------");
		System.out.println("Shuffled tasks:");
		for (String task : allTasks) {
			System.out.println("- " + task);
		}
	}

}
