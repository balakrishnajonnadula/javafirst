package exception.ArrayIndex;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 10, 64, 34 };
		System.out.println("Array is : " + Arrays.toString(arr));
		System.out.println("enter index to pick specific element");
		try {
			System.out.println(arr[scanner.nextInt()]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

	}
}
