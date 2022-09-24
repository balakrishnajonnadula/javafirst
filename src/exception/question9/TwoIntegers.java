package exception.question9;

import java.util.Scanner;

public class TwoIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		int quo = 0;
		try {
			quo = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			if (quo != 0)
				System.out.println("Quotitent : " + quo);
			else
				System.out.println("DivideByZeroException");
		}
		System.out.println("Continue..!");
	}

	public static int quotient(int num1, int num2) throws ArithmeticException {
		int quo = num1 / num2;
		return quo;
	}

}
