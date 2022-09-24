package exception.marks;

import java.util.Scanner;

public class Student {
	int marks;

	public static void main(String[] args) throws MarksOutOfboundsException {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter the marks between 0 to 100");
		int marks = scanner.nextInt();
		try {
			student.marksChecking(marks);
			System.out.println(student.marks);
		} catch (MarksOutOfboundsException e) {
			System.out.println(e);
		}
	}

	public void marksChecking(int num) throws MarksOutOfboundsException {
		if (num >= 0 && num <= 100) {
			this.marks = num;
		} else {
			throw new MarksOutOfboundsException("marks out of bounds exception");
		}

	}
}
