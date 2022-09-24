package com.patterns;

public class Pattern37 {

	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print('A' + " ");

			}
			for (int j = 1; j <= star; j++) {
				System.out.print(ch + " ");
			}
			star++;
			space--;
			ch++;
			System.out.println();
		}

	}

}
