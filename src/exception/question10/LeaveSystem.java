package exception.question10;

public class LeaveSystem {
	int leave;

	public LeaveSystem(int leave) throws LeaveQuotaExceededException {
		super();
		if (leave >= 1 && leave <= 20) {
			this.leave = leave;
			System.out.println("Leave is approved by System..!");
		} else {
			throw new LeaveQuotaExceededException("LeaveQuotaExceededExceptionByUser");
		}
	}

	public LeaveSystem() {
		super();
	}

}
