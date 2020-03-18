package com.exception.files;

public class ZeroDivisorException extends Exception {

	private static final long serialVersionUID = 2939198659006846101L;

	public ZeroDivisorException(Exception exception) {
		super(exception);
	}

	public ZeroDivisorException(String message) {
		super(message);
	}

}
