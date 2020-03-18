package com.collections.arrays;

import java.util.Objects;

public class Product {

	private String name;
	private double price;
	private String description;

	public Product(String name, double price, String description) {
		this.name = name;
		this.setPrice(price);
		this.setDescription(description);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		Product product = (Product) object;
		return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name)
				&& Objects.equals(description, product.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, description);
	}

	@Override
	public String toString() {
		return "Product{name='" + name + "'" + ", price=" + price + ", description='" + description + "'}";
	}

}
