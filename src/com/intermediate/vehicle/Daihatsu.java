package com.intermediate.vehicle;

public class Daihatsu extends Car {

	public Daihatsu(String model, String type, short yearOfLaunch, String color, String transmission,
			byte numberOfSeats, byte numberOfDoors, short power, short cubicCapacity, int price, int mileage,
			boolean secondHand, boolean isDamaged) {
		super("Daihatsu", model, type, yearOfLaunch, color, transmission, numberOfSeats, numberOfDoors, power,
				cubicCapacity, price, mileage, secondHand, isDamaged);
	}

	// Presentation view

	@Override
	public void startTheEngine() {
		System.out.println(super.getFullname() + " engine is started.");
	}

}
