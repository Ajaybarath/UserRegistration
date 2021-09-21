package com.bridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

interface Validation {
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

public class UserValidation implements UserValidationInterface{
	
	public String inputCall(String parameter) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter " + parameter);
		return s.nextLine();
	}
	
	public static void main(String args[]) {

		Validation userDetailCheck = (String regex, String input) -> {
			return Pattern.matches(regex, input);
		};
		
		UserValidationInterface userValidation = new UserValidation();

		String firstName = userValidation.inputCall("FirstName");

		String secondName = userValidation.inputCall("SecondName");

		String email = userValidation.inputCall("Email");

		String phone = userValidation.inputCall("Phone");

		String password = userValidation.inputCall("Password");
		
		Validation.printResult("[A-Z][a-zA-Z]{3,}",firstName, "FirstName", userDetailCheck);
		Validation.printResult("[A-Z][a-zA-Z]{3,}",secondName, "SecondName", userDetailCheck);
		Validation.printResult("([a][b][c][.]?){1}([a-zA-Z]{3,})?[@]([b][l][.][c][o][.]?[i]?[n]?)",email, "Email", userDetailCheck);
		Validation.printResult("([9][1][ ])[0-9]{10}",phone, "Phone", userDetailCheck);
		Validation.printResult("^(.{8,})*((?=.*[A-Z]).+)*((?=.*\\\\d).+)*((?=.*[.,:;\\\\'!@#$%^&*_+=|(){}]).+)$",password, "Password", userDetailCheck);


		
	}

}
