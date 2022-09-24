package myPackage;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 60;
		System.out.println("Factors of the Number " + number);
		
		for(int i=1; i<=number; i++) {
			if(number %i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
