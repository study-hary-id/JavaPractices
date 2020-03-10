package com.intermediate.vehicle;

import java.time.LocalDate;

public abstract class Car {

	private String brand;
	private String model;
	private String type;

	private short yearOfLaunch;

	// White, Silver, Black, Gray, Grey
	private String color;
	private String transmission;

	private byte numberOfSeats;
	private byte numberOfDoors;

	// Horsepower(HP) / Pferdestarke(PS)
	private short power;
	private short cubicCapacity;

	private int price;
	private int mileage;

	// New fields / attributes
	private boolean brandNew;
	private boolean secondHand;
	private boolean isDamaged;

	public Car(String brand, String model, String type, short yearOfLaunch, String color, String transmission,
			byte numberOfSeats, byte numberOfDoors, short power, short cubicCapacity, int price, int mileage,
			boolean secondHand, boolean isDamaged) {
		this.brand = brand;
		this.model = model;
		this.type = type;

		this.yearOfLaunch = yearOfLaunch;

		this.color = color;
		this.transmission = transmission;

		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;

		this.power = power;
		this.cubicCapacity = cubicCapacity;

		this.price = price;
		this.mileage = mileage;

		this.brandNew = LocalDate.now().getYear() - yearOfLaunch <= 2;
		this.secondHand = secondHand ? secondHand : mileage > 0 ? true : false;
		this.isDamaged = isDamaged;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getModel() {
		return this.model;
	}

	public String getType() {
		return this.type;
	}

	public String getFullname() {
		return this.brand + " " + this.model + " " + this.type;
	}

	public boolean isBrandNew() {
		return this.brandNew;
	}

	public boolean isSecondHand() {
		return this.secondHand;
	}

	public boolean isDamaged() {
		return this.isDamaged;
	}

	public boolean isManual() {
		return this.transmission == "MT";
	}

	// Controller

	public void setPrice(int price) {
		this.price = Math.abs(price);
	}

	public int getPrice() {
		return this.price;
	}

	public void drive(int mileage) {
		this.secondHand = true;
		this.mileage += Math.abs(mileage);
	}

	public void resetMileage() {
		this.mileage = 0;
	}

	// Presentation view

	public void startTheEngine() {
	}

	public void printMileage() {
		System.out.println("Mileage: " + mileage / 1000 + " KM");
	}

	public void printTransmission() {
		if (isManual()) {
			System.out.println("This car used manual transmission.");
		}
	}

	public void printDescription() {
		System.out.println(yearOfLaunch + " " + getFullname());
//		(secondHand ? printMileage() : "-");
		if (secondHand) {
			printMileage();
		}

		System.out.println("Color: " + color);
		System.out.println("Seats: " + numberOfSeats);
		System.out.println("Doors: " + numberOfDoors);
		System.out.println("Power: " + power + " HP/PS " + cubicCapacity + " cc");

		System.out.println("---------------------------");
		System.out.println("Price: Rp " + price + ",00-");
	}

}
