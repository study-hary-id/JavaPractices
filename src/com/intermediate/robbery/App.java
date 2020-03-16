package com.intermediate.robbery;

public class App {

	public static void main(String[] args) {
		City city = setItemsBuildingsCity();

		Police police = setItemsPolicemanPolice();

		Gangster gangster = setItemsGangsterCriminal();

		do {
			gangster.letsRob(city.getBuildings());
		} while (!police.catchCriminals(gangster));

		System.out.println();
		printPeopleInvolved();
	}

	static City setItemsBuildingsCity() {
		Item[] bankItems = { new Item("Letter opener", 1.5), new Item("Stamp", 2.5) };
		Building bank = new Building("Bank", bankItems);

		Item[] mansionItems = { new Item("Pair of fancy shoes", 25.0), new Item("Broken glass", 0.1) };
		Building mansion = new Building("Mansion", mansionItems);

		Item[] postOfficeItems = { new Item("Letter to Jenny", 1.5), new Item("Pencil", 2.0) };
		Building postOffice = new Building("Post Office", postOfficeItems);

		Item[] supermarketItems = { new Item("A loaf of bread", 2.5), new Item("A bag of tea", 6.5) };
		Building supermarket = new Building("Supermarket", supermarketItems);

		Building[] buildings = { bank, mansion, postOffice, supermarket };
		City city = new City(buildings);
		return city;
	}

	static Police setItemsPolicemanPolice() {
		Item[] adamItems = { new Item("Revolver", 500.0), new Item("Magnifying glass", 10.0) };
		Detective adamPalmer = new Detective("Adam Palmer", "Coyote", "chess", adamItems);

		Item[] johnItems = { new Item("Revolver", 500.0), new Item("Medium metal tonfa", 100.0) };
		Policeman johnDoe = new Policeman("John Doe", "Lawless", "gaming", johnItems);

		Item[] tomItems = { new Item("Revolver", 500.0), new Item("Silver sharp knuckle", 50.0) };
		Policeman tomCruise = new Policeman("Tom Cruise", "Fighter", "boxing", tomItems);

		Item[] donaldItems = { new Item("Revolver", 500.0), new Item("Cheap flaslight", 10.0) };
		Policeman donaldLi = new Policeman("Donald Li", "Atom", "computer", donaldItems);

		Policeman[] policeman = { johnDoe, tomCruise, donaldLi };
		return new Police("Police Department", adamPalmer, policeman);
	}

	static Gangster setItemsGangsterCriminal() {
		Item[] robItems = { new Item("Blunt Swiss knife", 10.5), new Item("Half rotten apple", 0.0) };
		Criminal rob = new Criminal("Rob", "The head", "breaking in", robItems);

		Item[] bobbyItems = { new Item("Baseball bat", 20.0), new Item("Bad toothpick", 0.5) };
		Criminal bobby = new Criminal("Bobby", "The mountain", "knocking out", bobbyItems);

		Criminal[] criminals = { rob, bobby };
		return new Gangster("The Triad", criminals);
	}

	static void printPeopleInvolved() {
		System.out.println(Person.getNumberOfPerson() + " people involved in this matter.");
	}

}
