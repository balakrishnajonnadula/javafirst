package exception.student;

import java.util.Scanner;

public class Student {
	int rollNum;
	String name;
	int age;
	String cource;

	public Student() {
		super();
	}

	public Student(int rollNum, String name, int age, String cource) throws UserDefinedException {
		super();
		this.rollNum = rollNum;
		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
			} else {
				throw new UserDefinedException("Name not Valid");
			}
		}
		this.name = name;
		if (age >= 15 && age <= 21) {
			this.age = age;
		} else {
			throw new UserDefinedException("Age Not within Range");
		}
		this.cource = cource;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roll number in");
		int roll = scanner.nextInt();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter age");
		int age = scanner.nextInt();
		System.out.println("Enter cource");
		String cource = scanner.next();
		try {
			Student student = new Student(roll, name, age, cource);
		} catch (UserDefinedException e) {
			System.out.println(e.toString());
		}

		System.out.println("Hello balakrishna im moving..!");
	}
}
