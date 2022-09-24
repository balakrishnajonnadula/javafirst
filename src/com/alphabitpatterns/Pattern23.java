package com.alphabitpatterns;

public class Pattern23 {

	public static void main(String[] args) {
		int space = 5;
		int star = 1;
		char ch = 'A';
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
			ch++;
			space--;
			star++;
		}

	}

}
