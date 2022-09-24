package exception.question8;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter valid age.");
		int age = scanner.nextInt();
		try {
			disPlayAge(age);
		} catch (AgeNotValidException e) {
			System.out.println(e);
		}
	}

	public static void disPlayAge(int age) throws AgeNotValidException {

		if (age >= 18 && age <= 60) {
			System.out.println("valid age : " + age);
		} else {
			throw new AgeNotValidException("AgeNotValidExceptionByUser");
		}
	}

}
