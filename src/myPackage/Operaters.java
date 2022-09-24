package myPackage;

public class Operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		char c = 'a';
		int res = a++ + 20 - b++ / 2 + 20;
		int res1 = b++ * 2 + a++ % 10 + c++ - 40;
		int res2 = a++ + c++ + b++ - 10;
		System.out.println(a + " " + b + " " + c);
		System.out.println(res + " " + res1 + " " + res2);
		System.out.println(res1);

	}

}
