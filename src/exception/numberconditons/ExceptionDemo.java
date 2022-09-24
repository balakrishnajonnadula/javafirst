package exception.numberconditons;

public class ExceptionDemo extends Exception {
	String message;

	public ExceptionDemo(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "ExceptionDemo [message=" + message + "]";
	}

}
