package exception.numberconditons;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Number number = new Number();
		System.out.println("Enter number..!");
		try {
			number.numberCheck(scanner.nextInt());
		} catch (ExceptionDemo e) {
			System.out.println(e);
		}
	}

	public void numberCheck(int num) throws ExceptionDemo {
		if (num >= 0 && num <= 5) {
			throw new ExceptionDemo("Samll Number : factorial of " + num + "is ==> " + fact(num));
		} else if (num >= 5 && num <= 10) {
			throw new ExceptionDemo("Proper Number : factorial of " + num + "is ==> " + fact(num));
		} else if (num >= 10) {
			throw new ExceptionDemo("Greater Number : factorial of " + num + "is ==> " + fact(num));
		}
	}

	public int fact(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}
		return sum;
	}

}
