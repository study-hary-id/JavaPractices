package com.intermediate.vehicle;

public class Toyota extends Car {

	public Toyota(String model, String type, short yearOfLaunch, String color, String transmission, byte numberOfSeats,
			byte numberOfDoors, short power, short cubicCapacity, int price, int mileage, boolean brandNew,
			boolean secondHand, boolean isDamaged) {
		super("Toyota", model, type, yearOfLaunch, color, transmission, numberOfSeats, numberOfDoors, power,
				cubicCapacity, price, mileage, brandNew, secondHand, isDamaged);
	}

	// Presentation view

	@Override
	public void startTheEngine() {
		System.out.println(super.getFullname() + " engine is started.");
	}

}
