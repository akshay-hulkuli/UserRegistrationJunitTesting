package com.bridgelabz.registrationtest;

import org.junit.Test;
import org.junit.Assert;


public class UserValidatorTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("Akshay");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("Ak");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("kshay");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("Hulkuli");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("Hl");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkName("hulk");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkEmail("akshay.hp@gmail.com.in");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkEmail("akshay@hp@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkMobileNumber("91 6361655398");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkMobileNumber("91 6361698");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkMobileNumber("916361698398");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenMobileNumber_WhenNoCountryCode_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkMobileNumber("6361698398");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("ASdk@20132");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("ADas@2");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("aa2222as@2");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoNumericalDigit_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("aaASDFas@");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("aaASDFas2");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();	
		boolean result = validator.checkPassword("aaASDFa@#$s2");
		Assert.assertFalse(result);
	}
	
	
	
}
