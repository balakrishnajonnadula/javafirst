package com.patterns;

public class Pattern25 {

	public static void main(String[] args) {
		int star = 0;
		for(int i = 1; i <= 9; i++) {
			char ch = 'A';
			if(i <= 5) {
				star++;
			}
			else {
				star--;
			}
			for(int j = 1; j <= star; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}
