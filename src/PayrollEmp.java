import java.util.Scanner;

public class PayrollEmp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Payroll payroll = new Payroll();
		System.out.println("Enter the basic Salary between 2500 - 5000..!");
		payroll.setBasicSal(scanner.nextDouble());
		payroll.salSlip();

	}

}
