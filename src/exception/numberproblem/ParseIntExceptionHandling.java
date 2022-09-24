package exception.numberproblem;

public class ParseIntExceptionHandling extends Exception {
	String message;

	public ParseIntExceptionHandling(String message) {
		super(message);
		this.message = message;
	}
}
