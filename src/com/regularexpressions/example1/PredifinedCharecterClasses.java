package com.regularexpressions.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredifinedCharecterClasses {

	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("\\s");// Lower case 's' only spaces
//		Pattern pattern = Pattern.compile("\\S");// Upper case 'S' Except spaces
//		Pattern pattern = Pattern.compile("\\d");// lower case 'd' only digits
//		Pattern pattern = Pattern.compile("\\D");// upper case 'D' Except digits
//		Pattern pattern = Pattern.compile("\\w");// lower case 'w' only Alphanumeric
//		Pattern pattern = Pattern.compile("\\W");// upper case 'W' Except Alphanumeric
		Pattern pattern = Pattern.compile(".");// accepts any character
		
		Matcher matcher = pattern.matcher("a7b k@9z");
		while (matcher.find()) {
			System.out.println(matcher.start() + "...." + matcher.group());
		}

	}

}
