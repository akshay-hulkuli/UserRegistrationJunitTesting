package com.bridgelabz.registrationtest;

public class UserValidationExceptions extends Exception {
	enum exceptionType{
		ENTERED_NULL,ENTERED_EMPTY
	}
	exceptionType type;
	public UserValidationExceptions(exceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
