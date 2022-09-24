package com.array_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommanValuesInStringArray {

	public static void main(String[] args) {
		String[] arr1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };

		String[] arr2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		System.out.println("Array1 : " + Arrays.toString(arr1));
		System.out.println("Array2 : " + Arrays.toString(arr2));

		System.out.print("Common elements in an Array is : ");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					System.out.print(arr1[i] + ", ");
				}
			}
		}

	}

}
