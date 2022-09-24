package com.alphabitpatterns;

public class Pattern4 {

	public static void main(String[] args) {
		int star = 6;
		for (int i = 1; i <= 12; i++) {
			char ch = 'A';
			for (int j = 1; j <= star; j++) {
				System.out.print(ch++);
			}
			System.out.println();
			if(i <6) {
				star--;
			}
			else if(i == 6) {
				
			}
			else {
				star++;
			}
		}

	}

}
