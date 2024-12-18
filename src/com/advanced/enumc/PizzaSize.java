package com.advanced.enumc;

public enum PizzaSize {
	SMALL("Small size"), MEDIUM("Medium size"), LARGE("Large size");

	private String pizzaSizeText;

	PizzaSize(String pizzaSizeText) {
		this.pizzaSizeText = pizzaSizeText;
	}

	public String getPizzaSizeText() {
		return this.pizzaSizeText;
	}
}
