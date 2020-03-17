package com.advanced.enumc.innerc.builder;

import com.advanced.enumc.PizzaSize;

public class Pizza {

	private String name;
	private PizzaSize pizzaSize;
	private boolean isExtraTomatoSauce;
	private boolean isSalad;
	private double price;

	public Pizza(Builder builder) {
		this.name = builder.name;
		this.pizzaSize = builder.pizzaSize;
		this.isExtraTomatoSauce = builder.isExtraTomatoSauce;
		this.isSalad = builder.isSalad;
		this.price = calculatePrice();
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

	public boolean isExtraTomatoSauce() {
		return this.isExtraTomatoSauce;
	}

	public boolean isSalad() {
		return this.isSalad;
	}

	public double getPrice() {
		return this.price;
	}

	public static class Builder {
		private String name;
		private PizzaSize pizzaSize;
		private boolean isExtraTomatoSauce;
		private boolean isSalad;

		Builder(String name, PizzaSize pizzaSize) {
			this.name = name;
			this.pizzaSize = pizzaSize;
		}

		public Builder withExtraTomatoSauce(boolean isExtraTomatoSauce) {
			this.isExtraTomatoSauce = isExtraTomatoSauce;
			return this;
		}

		public Builder withSalad(boolean isSalad) {
			this.isSalad = isSalad;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

}
