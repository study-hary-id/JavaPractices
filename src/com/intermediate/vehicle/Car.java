package com.intermediate.vehicle;

public class Car {

	private String brand;
	private String model;
	private String type;
	private short yearOfLaunch;

	private String color; // White, Silver, Black, Gray
	private String transmission;

	private byte numberOfSeats;
	private byte numberOfDoors;

	private short power; // Horsepower(HP) / Pferdestarke(PS)
	private short cubicCapacity;

	private int price;
	private int mileage;

	// New fields / attributes
	private boolean brandNew;
	private boolean secondHand;
	private boolean isDamaged;

	public Car(String brand, String model, String type, short yearOfLaunch, String color, String transmission,
			byte numberOfSeats, byte numberOfDoors, short power, short cubicCapacity, int price, int mileage,
			boolean brandNew, boolean secondHand, boolean isDamaged) {
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
		this.brandNew = brandNew;
		this.secondHand = secondHand;
		this.isDamaged = isDamaged;
	}

	// Model

	public String getTransmission() {
		return this.transmission;
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

	// Controller

	public void drive(int mileage) {
		this.secondHand = true;
		this.mileage += Math.abs(mileage);
	}

	public void resetMileage() {
		this.mileage = 0;
	}

	// Presentation view

	public void startTheEngine() {
		System.out.println("The engine is started.");
	}

	public void printMileage() {
		System.out.println("Mileage: " + mileage / 1000 + " KM");
	}

	public void printDescription() {
		System.out.println(yearOfLaunch + " " + brand + " " + model + " " + type);
		if (secondHand) {
			printMileage();
		}
//		(secondHand ? printMileage() : "-");
		System.out.println("Color: " + color);
		System.out.println("Seats: " + numberOfSeats);
		System.out.println("Doors: " + numberOfDoors);
		System.out.println("Power: " + power + " HP/PS " + cubicCapacity + " cc");
		System.out.println("---------------------------");
		System.out.println("Price: Rp " + price + ",00-");
	}

}
