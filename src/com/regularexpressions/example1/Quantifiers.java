package com.regularexpressions.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("a"); //  only one 'a'
//		Pattern pattern = Pattern.compile("a+"); //  at least one 'a'
//		Pattern pattern = Pattern.compile("a*"); // any number of 'a' including 0
//		Pattern pattern = Pattern.compile("a?"); // at most one 'a' including 0
		
		Matcher matcher = pattern.matcher("abaabaaab");
		
		while(matcher.find()) {
			System.out.println(matcher.start() + "-----" + matcher.group());
		}
	}

}
