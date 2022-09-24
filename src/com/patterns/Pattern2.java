package com.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 5; i++) {
			char ch = 'A';
			for(int j = 1; j <= star; j++) {
				System.out.print(ch++);
			}
			star++;
			System.out.println();
		}

	}

}
