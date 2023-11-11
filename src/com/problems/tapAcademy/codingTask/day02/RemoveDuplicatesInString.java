package com.problems.tapAcademy.codingTask.day02;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		
		//calling method
		String result = removeDuplicates(str);
		System.out.println(result);
	}

	
	//to remove duplicates in a string
	private static String removeDuplicates(String str) {

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));
		}

		StringBuilder temp = new StringBuilder("");

		for (char ch : set) {

			temp.append(ch);
		}

		return temp.toString();
	}
}
