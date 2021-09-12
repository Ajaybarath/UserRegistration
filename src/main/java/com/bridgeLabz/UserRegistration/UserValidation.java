package com.bridgeLabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	public static void main(String args[]) {
		System.out.println("Hello world");

		Scanner s = new Scanner(System.in);

		String firstName = s.next();

		boolean checkFirstName = Pattern.matches("[A-Z][a-zA-Z]{3,}", firstName);

		System.out.println("First name check : " + checkFirstName);

		String secondName = s.next();

		boolean checkSecondName = Pattern.matches("[A-Z][a-zA-Z]{3,}", secondName);

		System.out.println("Second name check : " + checkSecondName);
		
		String email = s.next();
		
		boolean checkEmail = Pattern.matches("([a][b][c][.]?){1}([a-zA-Z]{3,})?[@]([b][l][.][c][o][.]?[i]?[n]?)", email);
		
		System.out.println("Email check : " + checkEmail);


	}
}
