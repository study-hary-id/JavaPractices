package com.advanced.enumc.innerc;

import com.advanced.enumc.PizzaSize;

public class App {

	public static void main(String[] args) {
		// #3 Anonymous class
		Pizza firstPizzaOrder = new Pizza("Margherita", PizzaSize.MEDIUM) {
			@Override
			public String getName() {
				return "Anonymous Pizza";
			}
		};
		System.out.println("---------------------------");
		System.out.println(firstPizzaOrder.getName());
		System.out.println("---------------------------");

		Pizza secondPizzaOrder = new Pizza("Margherita", PizzaSize.MEDIUM);
		System.out.println(secondPizzaOrder.getName());

		// #2 Inner class within method local
		if (isPizzaReady(40)) {
			System.out.println("The pizza is ready.");
		} else {
			System.out.println("The pizza is not ready yet.");
		}

		// #1 Inner class within class: nested
		Pizza.PizzaSlice pizzaSliceSecondPizza = secondPizzaOrder.cutPizzaSlice();
		System.out.println("Pizza slice: " + pizzaSliceSecondPizza.calculatePizzaSliceArea());
	}

	public static boolean isPizzaReady(int waitedInMinutes) {
		// #2 Inner class within method local
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

}
