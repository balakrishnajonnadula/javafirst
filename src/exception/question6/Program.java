package exception.question6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		try {
			int std1 = 0;
			int std2 = 0;
			for (int i = 0; i <= arr1.length - 1; i++) {

				System.out.println("Enter student-1 marks in sub : " + (i + 1));
				int num1 = scanner.nextInt();
				if (num1 >= 0 && num1 <= 100) {
					arr1[i] = num1;

				} else {
					throw new NumberFormatException("NumberFormatException");
				}
				
				System.out.println("Enter student-2 marks in sub : " + (i + 1));
				int num2 = scanner.nextInt();
				if (num2 >= 0 && num2 <= 100) {
					arr1[i] = scanner.nextInt();
				} else {
					throw new NumberFormatException("NumberFormatException");
				}
			}

			for (int j = 0; j <= arr1.length - 1; j++) {
				std1 = std1 + arr1[j];
				std2 = std2 + arr2[j];
			}
			System.out.println("Avg marks : " + ((std1 + std2) / 2));
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Continue..!");

	}

}
