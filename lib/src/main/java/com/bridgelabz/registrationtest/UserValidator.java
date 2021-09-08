package com.bridgelabz.registrationtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	
	public static boolean checkName(String name) {
		Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}
	
	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+_.-][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2,})?)");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static boolean checkMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("[1-9][0-9][\\s][1-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public static boolean checkPassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9]).{8,}");
		Matcher matcher = pattern.matcher(password);
		if(!matcher.matches()) return false;
		pattern = Pattern.compile("^[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$");
		matcher = pattern.matcher(password);
		return matcher.matches();
	}
}

