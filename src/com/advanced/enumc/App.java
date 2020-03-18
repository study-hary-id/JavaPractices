package com.advanced.enumc;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		printAvailablePizzaSize();
		System.out.println();

		Pizza pizzaOrder = new Pizza("Margarita", PizzaSize.MEDIUM);
		printPizzaOrder(pizzaOrder);
		System.out.println();

		Pizza samePizzaOrder = (Pizza) pizzaOrder.clone();
		printPizzaOrder(samePizzaOrder);
	}

	static void printAvailablePizzaSize() {
		System.out.println("Available sizes:");
		for (PizzaSize pizzaSize : PizzaSize.values()) {
			System.out.print(pizzaSize.getPizzaSizeText() + ", ");
		}
		System.out.println();
	}

	static void printPizzaOrder(Pizza pizza) {
		System.out.println("I ordered the following pizza:");
		System.out.println("Name : " + pizza.getName());
		System.out.println("Size : " + pizza.getPizzaSize().getPizzaSizeText());
		System.out.println("Price: $" + pizza.getPrice());
	}

}
