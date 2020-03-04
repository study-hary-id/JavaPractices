package com.intermediate.vehicle;

import java.util.Random;

public class App {

	public static void main(String[] args) {

//		showCarsDescriptionAndTestDrive();

//		testSecondCarVisibilityMileageAfterReset();
	}

	public static void showCarsDescriptionAndTestDrive() {
		Car toyotaAvanza1_3EMT = new Car("Toyota", "Avanza", "1.3 E M/T", (short) 2022, "white", "MT", (byte) 7,
				(byte) 5, (short) 98, (short) 1329, 233100000, 0, true, false, false);

		Car toyotaAvanza1_3ECVT = new Car("Toyota", "Avanza", "1.3 E CVT", (short) 2022, "gray", "CVT", (byte) 7,
				(byte) 5, (short) 98, (short) 1329, 247800000, 0, true, false, false);

		Car[] myToyotaCars = { toyotaAvanza1_3EMT, toyotaAvanza1_3ECVT };
		Random randomNumberGenerator = new Random();
		int bound = 10000000;
		for (Car car : myToyotaCars) {
			car.printDescription();
			System.out.println("---------------------------");

			car.startTheEngine();
			car.drive(randomNumberGenerator.nextInt(bound));

			car.printMileage();
			System.out.println();
		}
	}

	public static void testSecondCarVisibilityMileageAfterReset() {
		// Initialization
		Car toyotaAvanza1_3ECVT = new Car("Toyota", "Avanza", "1.3 E CVT", (short) 2022, "gray", "CVT", (byte) 7,
				(byte) 5, (short) 98, (short) 1329, 247800000, 0, true, false, false);

		// Check mileage data before driving.
		// There are no data about mileage.
		toyotaAvanza1_3ECVT.printDescription();
		System.out.println();

		// Start the engine and driving.
		toyotaAvanza1_3ECVT.startTheEngine();
		toyotaAvanza1_3ECVT.drive(170000);
		System.out.println("Driving now \n");

		// Check mileage data after driving.
		// There will be data field mileage.
		toyotaAvanza1_3ECVT.printDescription();
		System.out.println();

		// Reset mileage
		toyotaAvanza1_3ECVT.resetMileage();
		System.out.println("Reset mileage \n");

		// There is still mileage data.
		// But with zero value.
		toyotaAvanza1_3ECVT.printDescription();
		// It means this car is a second hand car.
		// But it just reseted the mileage data.
		// Someone can't fraud the car dealer.
	}

}
