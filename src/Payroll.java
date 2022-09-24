
public class Payroll {

	private double basicSal;

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public void salSlip() {
		if (this.basicSal >= 2500 && this.basicSal <= 5000) {
			System.out.println("------Gross Earnings------");
			System.out.println("Basic salary : " + this.basicSal);

//			---------------Allowances..!-------------
//			HRA
			double hra = (40.0 / 100.0) * this.basicSal;
			System.out.println("HRA : " + hra);

//			special allowance.
			double splAllowance = (52.0 / 100.0) * this.basicSal;
			System.out.println("Special allowance : " + splAllowance);

//			fuel allowance.
			double fuelAllowance = (110.0 / 100.0) * this.basicSal;
			System.out.println("Fuel Allowance : " + fuelAllowance);

//			Entertainment benefit
			double EtBenfit = (110.0 / 100.0) * this.basicSal;
			System.out.println("Entertainment benefit : " + EtBenfit);

//			Gross salary
			double grossAmt = this.basicSal + hra + splAllowance + fuelAllowance + EtBenfit;
			System.out.println("Gross Earnings : " + grossAmt);
			System.out.println();

//			--------------deductions---------------
			System.out.println("--------Gross Deductions--------");
//			ESI
			double esi = (1.5 / 100.0) * this.basicSal;
			System.out.println("ESI : " + esi);

//			PF
			double pf = (25.0 / 100.0) * this.basicSal;
			System.out.println("PF :" + pf);

//			Insurance
			double insurence = (18.0 / 100.0) * this.basicSal;
			System.out.println("Insurance : " + insurence);

//			Total deductions
			double deductions = esi + pf + insurence;
			System.out.println("Gross deductions : " + deductions);
			System.out.println();

//			---------Net Pay-------
			System.out.println("-----------Net Pay---------");
			double netPay = grossAmt - deductions;
			System.out.println("Net Pay : " + netPay);

		} else {
			System.out.println("Enter the basic salary between 2500 - 5000");
		}
	}

}
