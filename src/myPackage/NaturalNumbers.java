package myPackage;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10, sum = 0;

		for (int i = 0; i <= num; i++) {
			// sum = sum + 1
			sum += i;
		}
		System.out.println("Sum = " + sum);	

		int a, b;
		
		a = 50;
		b = 3;					
		
		int w, x, y, z;
		
		w = -5 + 8 * 6;
		x = (55 + 9) % 9;
		y = 20 + -3 * 5 / 8;
		z = 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.println(a / b);
		System.out.println("\n" + w + "\n" + x + "\n" + y + "\n" + z);
		
	}

}
