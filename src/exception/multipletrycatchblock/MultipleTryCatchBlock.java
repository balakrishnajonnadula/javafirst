package exception.multipletrycatchblock;

public class MultipleTryCatchBlock {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 10);
			try {
				int[] intArray = { 1, 2 };
				System.out.println(intArray[3]);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello im krishna im moving..!");
	}

}
