package Math;

import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner activated
		Scanner sc = new Scanner(System.in);

		// subject-1 Marks scan and print.
		System.out.println("Enter Subject-1 Marks : ");
		int sub_1 = sc.nextInt();
		System.out.println("Subject-1 Marks is : " + sub_1);

		// subject-2 Marks scan and print.
		System.out.println("Enter Subject-2 Marks : ");
		int sub_2 = sc.nextInt();
		System.out.println("Subject-2 Marks is : " + sub_2);

		// subject-3 Marks scan and print.
		System.out.println("Enter Subject-3 Marks : ");
		int sub_3 = sc.nextInt();
		System.out.println("Subject-3 Marks is : " + sub_3);

		// Total marks
		int totalMarks = sub_1 + sub_2 + sub_3;
		System.out.println("Total marks of the Student : " + totalMarks);

		// Percentage
		int persentage = (totalMarks*100)/300;
		System.out.println("pesentage : " + persentage+"%");
		// Scan close
		sc.close();
	}

}
