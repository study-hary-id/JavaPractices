package com.advanced.enumc;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Available sizes:");
		for (PizzaSize pizzaSize : PizzaSize.values()) {
			System.out.print(pizzaSize.getPizzaSizeText() + ", ");
		}

		System.out.println("\n---------------------------");

		Pizza pizzaOrder = new Pizza("Margarita", PizzaSize.MEDIUM);

		System.out.println("I ordered the following pizza:");
		System.out.println("Name : " + pizzaOrder.getName());
		System.out.println("Size : " + pizzaOrder.getPizzaSize().getPizzaSizeText());
		System.out.println("Price: $" + pizzaOrder.getPrice());

		Pizza samePizzaOrder = (Pizza) pizzaOrder.clone();

		System.out.println("I ordered the following pizza:");
		System.out.println("Name : " + samePizzaOrder.getName());
		System.out.println("Size : " + samePizzaOrder.getPizzaSize().getPizzaSizeText());
		System.out.println("Price: $" + samePizzaOrder.getPrice());
	}

}
