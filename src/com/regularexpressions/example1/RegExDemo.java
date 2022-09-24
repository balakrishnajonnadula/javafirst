package com.regularexpressions.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern pattern = Pattern.compile("@gmail.com");
		Matcher matcher = pattern.matcher("balakrishna@gmail.com");
		while (matcher.find()) {
			count++;
			System.out.println(matcher.group() + "....." + matcher.start() + "....." + matcher.end());
		}
		System.out.println(count);

	}

}
