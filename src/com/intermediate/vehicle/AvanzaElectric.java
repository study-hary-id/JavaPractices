package com.intermediate.vehicle;

public class AvanzaElectric extends Toyota implements ElectricMode {

	public AvanzaElectric(String type, short yearOfLaunch, String color, String transmission, byte numberOfSeats,
			byte numberOfDoors, short power, short cubicCapacity, int price, int mileage, boolean secondHand,
			boolean isDamaged) {
		super("Avanza", type, yearOfLaunch, color, transmission, numberOfSeats, numberOfDoors, power, cubicCapacity,
				price, mileage, secondHand, isDamaged);
	}

	// Presentation view

	@Override
	public void startTheElectricEngine() {
		System.out.println(super.getFullname() + " starts its electric engine.");
	}

}
