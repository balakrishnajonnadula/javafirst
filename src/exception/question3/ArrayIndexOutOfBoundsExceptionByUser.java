package exception.question3;

public class ArrayIndexOutOfBoundsExceptionByUser extends Exception {
	String message;

	public ArrayIndexOutOfBoundsExceptionByUser(String message) {
		super(message);
		this.message = message;
	}

}
