package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, rem, temp = num, rev = 0;

		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if (temp == rev) {
			System.out.println( temp + " is a palindrome");
		}
		else {
			System.out.println(temp + " is not a palindrome");
		}

	}

}
