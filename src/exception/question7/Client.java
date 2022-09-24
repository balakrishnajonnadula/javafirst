package exception.question7;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter user name : ");
			String name = scanner.next();
			System.out.println("Enter Country : ");
			String country = scanner.next();
			UserRegistration uRegistration = new UserRegistration(name, country);
		} catch (InvalidCountryException e) {
			System.out.println(e);
		}
	}

}
