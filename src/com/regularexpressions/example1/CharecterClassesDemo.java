package com.regularexpressions.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharecterClassesDemo {

	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("[abc]");// only abc
//		Pattern pattern = Pattern.compile("[^abc]");// except abc
//		Pattern pattern = Pattern.compile("[0-9]");// any numaric
//		Pattern pattern = Pattern.compile("[^0-9]");// except numaric
//		Pattern pattern = Pattern.compile("[0-9a-zA-Z]");// Any Alpha numaric
		Pattern pattern = Pattern.compile("[^0-9a-zA-Z]");//except Any Alpha numaric
		Matcher matcher = pattern.matcher("ab* 43 @kl#");
		while(matcher.find()) {
			System.out.println(matcher.start() + "......" + matcher.group());
		}
	}

}
