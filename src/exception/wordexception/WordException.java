package exception.wordexception;

import java.util.Scanner;

public class WordException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string..!");
		String str = scanner.nextLine();
		String[] strArray = str.split(" ");
		WordException wException = new WordException();
		try {
			wException.wordCheck(strArray);
		} catch (StringWordException e) {
			System.out.println(e);
		}

	}

	public void wordCheck(String[] str) throws StringWordException {
		for (int i = 0; i <= str.length - 1; i++) {
			if (str[i].equalsIgnoreCase("india")) {
				throw new StringWordException("Word India persent");
			} else {
				System.out.println(str[i]);
			}
		}
	}
}
