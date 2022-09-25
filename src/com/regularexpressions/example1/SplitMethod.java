package com.regularexpressions.example1;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitMethod {

	public static void main(String[] args) {

//		using pattern 
		Pattern pattern = Pattern.compile("a");
		String[] str = pattern.split("Balakrishna jonnadula");
		for (String ex : str) {
			System.out.println(ex + " ");

		}
		System.out.println("=========================================");

//		Using String split()
		String s = "Balakrishna jonnadula"; 
		String[] str1 = s.split("a");
		System.out.println(Arrays.toString(str1));
		System.out.println("=========================================");

//		StringTokenizer
		StringTokenizer sTokenizer = new StringTokenizer("Balakrishna jonnadula");// default it take 'space'
		while (sTokenizer.hasMoreTokens()) {
			System.out.println(sTokenizer.nextToken());
		}
		System.out.println("=========================================");
		
//		Another example using specific charecter
		StringTokenizer sToken = new StringTokenizer("25-09-2022", "-");// default it take 'space'
		while (sToken.hasMoreTokens()) {
			System.out.println(sToken.nextToken());
		}
	}

}
