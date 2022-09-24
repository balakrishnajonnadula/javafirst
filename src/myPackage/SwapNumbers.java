package myPackage;

public class SwapNumbers {

	public static void main(String[] args) {
		int first, second;
		first = 5;
		second = 10;

		// Before swap the numbers

		System.out.println("---Before swap---");
		System.out.println("first is number" + first);
		System.out.println("first is number" + second);

		// After swap the numbers
		int temp = first;
		first = second;
		second = temp;

		System.out.println("---Before swap---");
		System.out.println("first is number" + first);
		System.out.println("first is number" + second);

	}

}
