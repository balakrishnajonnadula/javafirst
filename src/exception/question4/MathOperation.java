package exception.question4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		MathOperation mOperation = new MathOperation();
		try {
			mOperation.intArray(mOperation.scanner.nextInt());
		} catch (MathOperationException | InputMismatchException e) {
			System.out.println(e);
		}
	}

	public void intArray(int num) throws MathOperationException {
		int[] arr = new int[num];
		for (int i = 0; i <= num - 1; i++) {
			System.out.println("Enter value in index : " + (i + 1));
			arr[i] = scanner.nextInt();
		}
		System.out.println("Given numbers are : " + Arrays.toString(arr));
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		int avg = (sum / (arr.length - 1));
		System.out.println("Average is : " + avg);
	}

}
