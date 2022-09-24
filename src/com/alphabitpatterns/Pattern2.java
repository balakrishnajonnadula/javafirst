package com.alphabitpatterns;

public class Pattern2 {

	public static void main(String[] args) {
		int star = 1;
		char ch = 'A';
		for(int i = 1; i <= 6 ; i++) {
			for(int j = 1; j <= star; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
			star++;
		}

	}

}
