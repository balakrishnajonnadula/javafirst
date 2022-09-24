package exception.wordexception;

public class StringWordException extends Exception {
	String message;

	public StringWordException(String message) {
		super(message);
		this.message = message;
	}

}
