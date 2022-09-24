package exception.maximumarrayelement;

public class MaxArrayElement {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 10 };
		try {
			array[6] = 40;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
