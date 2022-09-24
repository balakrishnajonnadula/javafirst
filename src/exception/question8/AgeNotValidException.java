package exception.question8;

public class AgeNotValidException extends Exception {
	String message;

	public AgeNotValidException(String message) {
		super(message);
		this.message = message;
	}

}
