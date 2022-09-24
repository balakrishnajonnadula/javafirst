package myPackage;

public class StaticVariable {
	static int x = 10;
	static int y;
	static float z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticVariable.x);
		x = 100;
		System.out.println(StaticVariable.x);
		int x = 20;
		System.out.println(x + StaticVariable.y);
		y = 10;
		System.out.println(StaticVariable.x + " = " + StaticVariable.y);
		x = 15;
		System.out.println(StaticVariable.x * y);

//		z = 5.99f;
		System.out.println(z);
	}

}
