package com.alphabitpatterns;

public class Pattern30 {

	public static void main(String[] args) {
		int star = 6;
		int space = 1;
		char ch = 'F';
		for (int i = 1; i <= 11; i++) {
			char ch1 = 'A';
			char temp = ch;
			for (int j = 1; j <= star; j++) {
				System.out.print(ch1++);
			}
			for (int j = 2; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(temp--);
			}
			System.out.println();
			if (i < 6) {
				ch--;
				space += 2;
				star--;
			} else {
				ch++;
				space -= 2;
				star++;
			}
		}

	}

}
