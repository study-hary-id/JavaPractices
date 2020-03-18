package com.advanced.enumc;

public class App {

	public static void main(String[] args) {

//		printAvailablePizzaOrder();

		testPizzaWithObjectClone();

		testPizzaWithObjectEquals();

		testPizzaWithObjectGetClass();

		testPizzaWithObjectHashCode();

	}

	static void printAvailablePizzaSize() {
		System.out.println("Available sizes:");
		for (PizzaSize pizzaSize : PizzaSize.values()) {
			System.out.print(pizzaSize.getPizzaSizeText() + ", ");
		}
		System.out.println();
	}

	static void printPizzaOrder(Pizza pizza) {
		System.out.println("I ordered the following pizza:");
		System.out.println("Name : " + pizza.getName());
		System.out.println("Size : " + pizza.getPizzaSize().getPizzaSizeText());
		System.out.println("Price: $" + pizza.getPrice());
	}

	static void printAvailablePizzaOrder() throws CloneNotSupportedException {
		printAvailablePizzaSize();
		System.out.println();

		Pizza pizzaOrder = new Pizza("Margarita", PizzaSize.MEDIUM);
		printPizzaOrder(pizzaOrder);
		System.out.println();

		Pizza samePizzaOrder = (Pizza) pizzaOrder.clone();
		printPizzaOrder(samePizzaOrder);
		System.out.println();
	}

	static void testPizzaWithObjectClone() {
		try {

			Pizza margarita = new Pizza("Margarita", PizzaSize.MEDIUM);
			Pizza margaritaClone = (Pizza) margarita.clone();
			System.out.print("testPizzaWithObjectClone: ");
			System.out.println(margarita != margaritaClone ? "Pass" : "Fail");

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	static void testPizzaWithObjectEquals() {
		try {

			Pizza margheritaLG = new Pizza("Margherita", PizzaSize.LARGE);
			Pizza margarita = new Pizza("Margarita", PizzaSize.MEDIUM);
			Pizza margaritaClone = (Pizza) margarita.clone();

			System.out.println("testPizzaWithObjectEquals:");

			System.out.print("    use the same objects: ");
			System.out.println(margarita.equals(margarita) ? "Pass" : "Fail");

			System.out.print("    object is not instance of Pizza: ");
			System.out.println(!margarita.equals("Pizza Order") ? "Pass" : "Fail");

			System.out.print("    same object with same attributes value: ");
			System.out.println(margarita.equals(margaritaClone) ? "Pass" : "Fail");

			System.out.print("    same object with different attributes value: ");
			System.out.println(!margarita.equals(margheritaLG) ? "Pass" : "Fail");

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	static void testPizzaWithObjectGetClass() {
		Pizza margarita = new Pizza("Margarita", PizzaSize.MEDIUM);
		System.out.print("testPizzaWithObjectGetClass: ");
		System.out.println(margarita.getClass());

		System.out.print("    test class name with package: ");
		System.out.println(margarita.getClass().getName() == "com.advanced.enumc.Pizza" ? "Pass" : "Fail");

		System.out.print("    test class name without package: ");
		System.out.println(margarita.getClass().getSimpleName().equals("Pizza") ? "Pass" : "Fail");

//		System.out.println(margarita.getClass().getSuperclass());
//		System.out.println(Arrays.toString(margarita.getClass().getFields()));
//		System.out.println(Arrays.toString(margarita.getClass().getDeclaredFields()));
//		System.out.println(Arrays.toString(margarita.getClass().getMethods()));
//		System.out.println(Arrays.toString(margarita.getClass().getDeclaredMethods()));
	}

	static void testPizzaWithObjectHashCode() {
		try {

			Pizza margarita = new Pizza("Margarita", PizzaSize.MEDIUM);
			Pizza margaritaClone = (Pizza) margarita.clone();

			System.out.println("testPizzaWithObjectHashCode: ");
			System.out.println("    margarita's hashcode: " + margarita.hashCode());
			System.out.println("    margaritaClone's hashcode: " + margaritaClone.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
