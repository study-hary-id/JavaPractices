package com.exception.files;

public class App {

	public static void main(String[] args) {
		System.out.println(divide(30, 15));
		System.out.println(divide(15, 0));
	}

	private static int divide(int dividend, int divisor) {
		try {
			if (divisor == 0) {
				throw new ZeroDivisorException("The divisor can not be zero: Custom exception");
			}
			return dividend / divisor;
		} catch (NullPointerException exception) {
			exception.printStackTrace();
			return 0;
		} catch (ZeroDivisorException | NumberFormatException exception) {
//			System.err.println(exception.getMessage());
			exception.printStackTrace();
			return 0;
		} finally {
			System.out.println("Divide:");
		}
	}

}
