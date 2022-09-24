package com.patterns;

public class Pattern13 {

	public static void main(String[] args) {
		int star = 1;
		int space = 4;
		char ch = 'A';
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print(ch + " ");
			}
			ch++;
			space--;
			star++;
			System.out.println();
		}

	}

}
