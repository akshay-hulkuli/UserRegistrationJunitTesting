package com.bridgelabz.registrationtest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
	

@RunWith(Parameterized.class)
public class EmailValidatorTest {
	private String emailAddress;
	private boolean ExpectedResult;
	private UserValidator userValidator;
	
	public EmailValidatorTest(String emailAddress, boolean ExpectedResult) {
		super();
		this.emailAddress = emailAddress;
		this.ExpectedResult = ExpectedResult;
	}
	
	@Before
	public void initailize() {
		userValidator = new UserValidator();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@bridgelabz.co.in", true }, { "abc@gmail.com.com", true },
			{ "abc@yahoo.com", true }, { "abc@1.com", true }, { "abc-100@yahoo.com", true },
			{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
			{ "abc.100@abc.com.au", true }, { "abc+100@gmail.com", true },
			{ ".abc@abc.com", false }, { "abc", false }, { "abc@.com.my", false }, { "abc@abc@gmail.com", false },
			{ "abc()*@gmail.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
			{ "abc123@.com", false }, { "abc123@.com.com", false }, { "abc123@gmail.a", false },
			{ "abc@%*.com", false }, { "abc@gmail.com.1a", false }, { ".abc@gmail.com.aa.au", false } });
	}
	
	@Test
	public void testEmails() {
		boolean valid = userValidator.checkEmail(emailAddress);
		System.out.println("the email: "+emailAddress+" is valid : "+valid);
		assertEquals(ExpectedResult, valid);
	}
}
