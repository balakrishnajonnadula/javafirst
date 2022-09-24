package exception.charecterdigit;

public class CharecterException extends Exception {

	String message;

	public CharecterException(String message) {
		super(message);
		this.message = message;
	}

}
