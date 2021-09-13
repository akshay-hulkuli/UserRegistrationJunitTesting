package com.bridgelabz.registrationtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class UserValidator {
	
	private static final String NAME_REG_EX = "[A-Z][a-zA-Z]{2,}";
	private static final String EMAIL_REG_EX = "([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)";
	private static final String PASSWORD_REG_EX1 = "(?=.*[A-Z])(?=.*[0-9]).{8,}";
	private static final String PASSWORD_REG_EX2 = "^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$";
	private static final String MOBILE_REG_EX = "[1-9][0-9][\\s][1-9][0-9]{9}";
	
	@FunctionalInterface
	interface Validation{
		boolean inputCheck(String regEx, String input);
	}
	static Validation dataValidator = (String regEx, String input) -> { 
		boolean check= Pattern.matches(regEx,input);
		return check;
	};
	
	
	
	public static boolean checkName(String name) throws UserValidationExceptions {
		try {
			if(name.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			return dataValidator.inputCheck(NAME_REG_EX,name);
		}
		catch(NullPointerException e){
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	
	public static boolean checkEmail(String email) throws UserValidationExceptions {
		try {
			if(email.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			return dataValidator.inputCheck(EMAIL_REG_EX,email);
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	public static boolean checkMobileNumber(String mobileNumber) throws UserValidationExceptions {
		try {
			if(mobileNumber.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			return dataValidator.inputCheck(MOBILE_REG_EX,mobileNumber);
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	public static boolean checkPassword(String password) throws UserValidationExceptions {
		try {
			if(password.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			if(!dataValidator.inputCheck(PASSWORD_REG_EX1,password)) return false;
			return dataValidator.inputCheck(PASSWORD_REG_EX2,password);
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	
	
	
}

