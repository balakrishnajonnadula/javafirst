package com.alphabitpatterns;

public class Pattern15 {

	public static void main(String[] args) {
		int space = 1;
		int star = 6;
		for(int i = 1; i <= 6 ; i++) {
			char ch = 'A';
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}
