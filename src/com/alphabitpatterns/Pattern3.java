package com.alphabitpatterns;

public class Pattern3 {

	public static void main(String[] args) {
		int star = 1;
		for(int i = 1; i <= 11; i++) {
			char ch = 'A';
			for(int j = 1; j <= star; j++) {
				System.out.print(ch++);
			}
			System.out.println();
			if(i < 6) {
				star++;
			}
			else {
				star--;
			}
		}

	}

}
