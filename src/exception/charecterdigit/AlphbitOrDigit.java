package exception.charecterdigit;

import java.util.Scanner;

public class AlphbitOrDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter charecter");
		char ch = scanner.next().charAt(0);
		AlphbitOrDigit aOrDigit = new AlphbitOrDigit();
		try {
			aOrDigit.alphbitOrDigit(ch);
		} catch (CharecterException e) {
			System.out.println(e);
		}
	}

	public void alphbitOrDigit(char ch) throws CharecterException {
		if (ch >= 'a' && ch <= 'z') {
			throw new CharecterException("Lower case");
		} else if (ch >= 'A' && ch <= 'Z') {
			throw new CharecterException("Capital case");
		} else if (ch >= '0' && ch <= '9') {
			throw new CharecterException("digit not allowed");
		} else {
			throw new CharecterException("Special charecter");
		}
	}

}
