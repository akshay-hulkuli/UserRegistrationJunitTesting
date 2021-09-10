package com.bridgelabz.registrationtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	
	public static boolean checkName(String name) throws UserValidationExceptions {
		try {
			if(name.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
			Matcher matcher = pattern.matcher(name);
			return matcher.matches();
		}
		catch(NullPointerException e){
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	public static boolean checkEmail(String email) throws UserValidationExceptions {
		try {
			if(email.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	public static boolean checkMobileNumber(String mobileNumber) throws UserValidationExceptions {
		try {
			if(mobileNumber.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			Pattern pattern = Pattern.compile("[1-9][0-9][\\s][1-9][0-9]{9}");
			Matcher matcher = pattern.matcher(mobileNumber);
			return matcher.matches();
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
	
	public static boolean checkPassword(String password) throws UserValidationExceptions {
		try {
			if(password.length()==0) throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_EMPTY, "Empty string is passed invalid");
			Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9]).{8,}");
			Matcher matcher = pattern.matcher(password);
			if(!matcher.matches()) return false;
			pattern = Pattern.compile("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
			matcher = pattern.matcher(password);
			return matcher.matches();
		}
		catch(NullPointerException e) {
			throw new UserValidationExceptions(UserValidationExceptions.exceptionType.ENTERED_NULL, "Null string is passed invalid");
		}
	}
}

