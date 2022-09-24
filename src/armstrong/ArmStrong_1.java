package armstrong;

public class ArmStrong_1 {

	public static void main(String[] args) {
		int count = 0, sum = 0;
		
		for (int num = 0; num <= 999999; num++) {
			
			int number = num;
			
			while (number > 0) {
				number = number / 10;
				count++;
			}
			
			int temp = num;
			int temp1 = temp;
			
			if (count == 6) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem * rem * rem * rem);
					temp = temp / 10;
				}
			}
			
			else if (count == 5) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem * rem * rem);
					temp = temp / 10;
				}
			}
			
			else if (count == 4) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem * rem);
					temp = temp / 10;
				}
				

			} else if (count == 3) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem);
					temp = temp / 10;
				}

			} else if (count == 2) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem);
					temp = temp / 10;
				}

			} else if (count == 1) {
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem);
					temp = temp / 10;
				}
			}
			
			if (sum == temp1) {
				System.out.print(num + " ");
			}

			count = 0;
			sum = 0;

		}

	}

}
