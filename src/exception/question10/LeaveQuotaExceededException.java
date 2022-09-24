package exception.question10;

public class LeaveQuotaExceededException extends Exception {
	String message;

	public LeaveQuotaExceededException(String message) {
		super(message);
		this.message = message;
	}

}
