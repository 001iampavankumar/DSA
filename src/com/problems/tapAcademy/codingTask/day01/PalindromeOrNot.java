package com.problems.tapAcademy.codingTask.day01;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String str = "malayalam";
		//output : 
		//palindrome

		boolean result = isPalindrome(str);
		if (result) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	private static boolean isPalindrome(String str) {

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
