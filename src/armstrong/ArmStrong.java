package armstrong;

public class ArmStrong {

	public static void main(String[] args) {
		
		int count = 0, sum = 0;
		
		for(int num = 10; num <= 9999; num++) {
			int temp = num;
			int temp1 = temp;
			int number = num;
			while(number > 0) { 
				number = number /10;
				count++;
			}
//			System.out.println(count);
//			System.out.println(num);
			if (count == 4) {
//				int temp1 = temp;
//				System.out.println("count is 3");
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem * rem);
					temp = temp / 10;
				}
				if (sum == temp1) {
					System.out.println(num + " is an armstrong number");
				}
//				else {
//					System.out.println(num + " is not an armstrong number");
//				}
				
			}
			else if (count == 3) {
//				int temp1 = temp;
//				int temp = num;
//				System.out.println("count is 3");
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem * rem);
					temp = temp / 10;
				}
				if (sum == temp1) {
					System.out.println(num + " is an armstrong number");
				}
//				else {
//					System.out.println(num + " is not an armstrong number");
//				}
			}
			else if (count == 2) {
//				int temp1 = temp;
//				System.out.println("count is 3");
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem * rem);
					temp = temp / 10;
				}
				if (sum == temp1) {
					System.out.println(num + " is an armstrong number");
				}
//				else {
//					System.out.println(num + " is not an armstrong number");
//				}
			}
			else if (count == 1) {
//				int temp1 = temp;
//				System.out.println("count is 3");
				while (temp > 0) {
					int rem = temp % 10;
					sum = sum + (rem);
					temp = temp / 10;
				}
				if (sum == temp1) {
					System.out.println(num + " is an armstrong number");
				}
//				else {
//					System.out.println(num + " is not an armstrong number");
//				}
			}
			
//			if (temp == sum) {
//				System.out.println(num +" is an armstrong number");
//			}
//			else {
//				System.out.println(num + " is not");
//			}
			count = 0;
			sum = 0;
			
		}
	}

}
