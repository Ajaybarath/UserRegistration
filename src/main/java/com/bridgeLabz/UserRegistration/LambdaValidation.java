package com.bridgeLabz.UserRegistration;

interface Validation{
	boolean validate(String regex, String input);
	
	public static void printResult(String regex, String input, String parameter, Validation validation) {
		
		if (validation.validate(regex, input) == true) {
			System.out.println("Valid " + parameter);
		}
		else {
			System.out.println("Invalid " + parameter);
		}
	}
}

public class LambdaValidation {

}
