package com.generics.files;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		implementBoxOrderedPair();

//		implementGenericFunctions();
	}

	static void implementBoxOrderedPair() {
		Box<Integer> genericNumber = new Box<>();
		genericNumber.setTypeData(17);
		Util.displayToString(genericNumber);

		Box<String> genericActor = new Box<>();
		genericActor.setTypeData("Tom Cruise");
		Util.displayToString(genericActor);

		ArrayList<Box<String>> pileOfBoxes = new ArrayList<>();
		pileOfBoxes.add(genericActor);
		pileOfBoxes.add(genericActor);
		Util.displayToString(pileOfBoxes);

		ArrayList<OrderedPair<String, String>> listOfCountries = new ArrayList<>();
		OrderedPair<String, String> germany = new OrderedPair<>("GER", "Germany");
		OrderedPair<String, String> malta = new OrderedPair<>("MLT", "Malta");

		listOfCountries.add(malta);
		listOfCountries.add(germany);
		Util.displayToString(listOfCountries);
	}

	static void implementGenericFunctions() {
		ArrayList<Integer> lotteryNumbers = new ArrayList<>(Arrays.asList(23, 45, 57, 82, 14));
		GenericFunctions.addNumbers(lotteryNumbers);
		GenericFunctions.printList(lotteryNumbers);
//		GenericFunctions.displayToString(lotteryNumbers);

//		GenericFunctions<Double> genericFunctions = new GenericFunctions<>();
//		Remove the comment to see the issue with 
//		taking lotteryNumbers as parameter.
//		genericFunctions.printSimpleGenerics(lotteryNumbers);
	}

}
