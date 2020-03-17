package com.advanced.enumc.innerc.builder;

import com.advanced.enumc.PizzaSize;

public class App {

	public static void main(String[] args) {

		Pizza pizza = new Pizza.Builder("Margherita", PizzaSize.LARGE).withExtraTomatoSauce(true).build();
		printPizzaOrder(pizza);

		System.out.println("");

		PizzaV2 newPizza = new PizzaV2.Builder("Margarita", PizzaSize.MEDIUM).withExtraTomatoSauce().withSalad()
				.build();
		printPizzaOrder(newPizza);

	}

	public static String yesOrNo(boolean option) {
		return option ? "Yes" : "No";
	}

	public static boolean isPizzaReady(int waitedInMinutes) {
		// #2 Inner class within method
		class Oven {
			public boolean isPizzaBakedProperly() {
				if (waitedInMinutes > 30) {
					return true;
				}
				return false;
			}
		}

		Oven oven = new Oven();
		return oven.isPizzaBakedProperly();
	}

	public static void printPizzaOrder(Pizza pizza) {
		System.out.println("Name: " + pizza.getName());
		System.out.println("Size: " + pizza.getPizzaSize().getPizzaSizeText());
		System.out.println("---------------------------");
		System.out.println("Option");
		System.out.println("Extra tomato sauce: " + yesOrNo(pizza.isExtraTomatoSauce()));
		System.out.println("Salad: " + yesOrNo(pizza.isSalad()));
		System.out.println("---------------------------");
		if (isPizzaReady(40)) {
			System.out.println("The pizza is ready.");
		} else {
			System.out.println("The pizza is not ready yet.");
		}
		System.out.println("Price: " + pizza.getPrice());
	}

	public static void printPizzaOrder(PizzaV2 pizza) {
		System.out.println("Name: " + pizza.getName());
		System.out.println("Size: " + pizza.getPizzaSize().getPizzaSizeText());
		System.out.println("---------------------------");
		System.out.println("Option");
		System.out.println("Extra tomato sauce: " + yesOrNo(pizza.isExtraTomatoSauce()));
		System.out.println("Salad: " + yesOrNo(pizza.isSalad()));
		System.out.println("---------------------------");
		if (isPizzaReady(40)) {
			System.out.println("The pizza is ready.");
		} else {
			System.out.println("The pizza is not ready yet.");
		}
		System.out.println("Price: " + pizza.getPrice());
	}
}
