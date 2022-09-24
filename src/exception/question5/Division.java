package exception.question5;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first num");
		int fNum = scanner.nextInt();
		System.out.println("Enter second num");
		int sNum = scanner.nextInt();
		try {
			System.out.println("output after division is : " + fNum / sNum);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Continue..!");
	}
}
