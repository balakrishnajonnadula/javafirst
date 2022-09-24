package exception.stringlength;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ");
		StringLength sLength = new StringLength();
		try {
			sLength.StrLength(scanner.next());
		} catch (ExceptionDemo e) {
			System.out.println(e);
		}

	}

	public void StrLength(String str) throws ExceptionDemo {
		if (str.length() >= 0 && str.length() <= 5) {
			throw new ExceptionDemo("too small string");
		} else if (str.length() >= 5 && str.length() <= 10) {
			throw new ExceptionDemo("Perfect String");
		} else {
			throw new ExceptionDemo("large String");
		}
	}

}
