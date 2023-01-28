package com.practice.ms.webservice.exception;

public class GreetingNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GreetingNotFoundException(String string) {
		super(string);
	}
}
