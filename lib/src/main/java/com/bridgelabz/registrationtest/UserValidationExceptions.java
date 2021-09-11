package com.bridgelabz.registrationtest;

public class UserValidationExceptions extends RuntimeException {
	enum exceptionType{
		ENTERED_NULL,ENTERED_EMPTY
	}
	exceptionType type;
	public UserValidationExceptions(exceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
