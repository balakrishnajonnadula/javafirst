package exception.question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Test test = new Test();

		System.out.println("Enter the size of an array");
		try {
			int[] arr = test.createArray(test.scanner.nextInt());
			test.specificIndex(arr);
		} catch (ArrayIndexOutOfBoundsExceptionByUser | InputMismatchException e) {
			System.out.println(e);
		}

	}

	public int[] createArray(int num) {
		int[] intArr = new int[num];
		for (int i = 0; i <= intArr.length - 1; i++) {
			System.out.println("Enter value in index : " + (i + 1));
			intArr[i] = scanner.nextInt();
		}
		return intArr;
	}

	public void specificIndex(int[] arr) throws ArrayIndexOutOfBoundsExceptionByUser {
		System.out.println("Enter index value to get sepecific value");
		int num = scanner.nextInt();
		if (num >= 0 && num <= arr.length - 1) {
			System.out.println(arr[num]);
		} else {
			throw new ArrayIndexOutOfBoundsExceptionByUser("ArrayIndexOutOfBoundsException");
		}
	}

}
