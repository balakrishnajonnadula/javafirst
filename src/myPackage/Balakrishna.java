package myPackage;

public class Balakrishna {
	byte b = 120;
	short s = 130;
	int i = 140;
	long l = 150;
	char c = 'c';
	float f = 160.11f;
	double d = 170.22;
	boolean bool = false;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Balakrishna b1 = new Balakrishna();
		Balakrishna b2 = new Balakrishna();

		// Initial values of object b1
		System.out.println(b1.b);
		System.out.println(b1.s);
		System.out.println(b1.i);
		System.out.println(b1.l);
		System.out.println(b1.c);
		System.out.println(b1.f);
		System.out.println(b1.d);
		System.out.println(b1.bool + "\n");

		// values has been Reintialisation for object b1...
		b1.b = 20;
		b1.s = 30;
		b1.i = 40;
		b1.l = 50;
		b1.c = '3';
		b1.f = 60.11f;
		b1.d = 70.22;
		b1.bool = true;

		System.out.println(b1.b);
		System.out.println(b1.s);
		System.out.println(b1.i);
		System.out.println(b1.l);
		System.out.println(b1.c);
		System.out.println(b1.f);
		System.out.println(b1.d);
		System.out.println(b1.bool + "\n");

		// Initial values of object b2
		System.out.println(b2.b);
		System.out.println(b2.s);
		System.out.println(b2.i);
		System.out.println(b2.l);
		System.out.println(b2.c);
		System.out.println(b2.f);
		System.out.println(b2.d);
		System.out.println(b2.bool + "\n");

		// values has been Reintialisation for object b2...
		b2.b = 2;
		b2.s = 3;
		b2.i = 4;
		b2.l = 5;
		b2.c = '@';
		b2.f = 6.11f;
		b2.d = 7.22;
		b2.bool = false;

		// Initial values of object b2
		System.out.println(b2.b);
		System.out.println(b2.s);
		System.out.println(b2.i);
		System.out.println(b2.l);
		System.out.println(b2.c);
		System.out.println(b2.f);
		System.out.println(b2.d);
		System.out.println(b2.bool + "\n");

	}

}
