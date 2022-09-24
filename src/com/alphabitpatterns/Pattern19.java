package com.alphabitpatterns;

public class Pattern19 {

	public static void main(String[] args) {
		int space = 5;
		int star = 1;
		char ch = 'F';
		for (int i = 1; i <= 6; i++) {
			char temp = ch;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(temp++ + " ");
			}
			ch--;
			System.out.println();
			space--;
			star++;
		}

	}

}
