package com.advanced.enumc.innerc;

import com.advanced.enumc.PizzaSize;

public class Pizza {

	private String name;
	private PizzaSize pizzaSize;
	private double price;

	public Pizza(String name, PizzaSize pizzaSize) {
		this.name = name;
		this.pizzaSize = pizzaSize;
		this.price = calculatePrice();
	}

	// #1 Inner class within class: nested
	class PizzaSlice {
		public String calculatePizzaSliceArea() {
			switch (pizzaSize) {
			case LARGE:
				return "Large size";
			case MEDIUM:
				return "Medium size";
			case SMALL:
			default:
				return "Small size";
			}
		}
	}

	public PizzaSlice cutPizzaSlice() {
		return new PizzaSlice();
	}

	private double calculatePrice() {
		switch (pizzaSize) {
		case LARGE:
			return 10.99;
		case MEDIUM:
			return 7.99;
		case SMALL:
		default:
			return 5.99;
		}
	}

	public String getName() {
		return this.name + " Pizza";
	}

	public PizzaSize getPizzaSize() {
		return this.pizzaSize;
	}

	public double getPrice() {
		return this.price;
	}

}
