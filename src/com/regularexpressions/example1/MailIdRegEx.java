package com.regularexpressions.example1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdRegEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Mail id Example [a-zA-Z0-9][a-zA-Z0-9.] @ [a-zA-Z0-9]+ ([.][a-zA-z]+)+ Only
		 * for gmail.com --> [a-zA-Z0-9][a-zA-Z0-9.]* @gmail[.]com
		 */

//		for Gmail
		Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9.]*@gmail[.]com");
		while (true) {
			System.out.println("Enter email id");
			String email = scanner.next();
			Matcher matcher = pattern.matcher(email);
			if (matcher.find() && matcher.group().equals(email)) {
				System.out.println(email + "  is valid email..!");
				break;
			} else {
				System.out.println(email + " is invalid email..!");
			}
		}

//		For Any Email
		Pattern pattern1 = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9.]+@[a-zA-Z]+([.][a-zA-Z]+)+");
		while (true) {
			System.out.println("Enter email id");
			String email = scanner.next();
			Matcher matcher1 = pattern1.matcher(email);
			if (matcher1.find() && matcher1.group().equals(email)) {
				System.out.println(email + "  is valid email..!");
				break;
			} else {
				System.out.println(email + " is invalid email..!");
			}
		}

	}

}
