package com.problems.tapAcademy.codingTask.day01;

import java.util.Scanner;

public class AlphaNumericSpecial {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = scan.next();
		
		boolean result = alphaNumericSpecial(str);
		System.out.println("Result: "+result);
		scan.close();
	}

	private static boolean alphaNumericSpecial(String str) {

		boolean upper = false;
		boolean lower = false;
		boolean numeric = false;
		boolean special = false;
		
		for(int i = 0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch>='A'&&ch<='Z') {
				upper = true;
			}
			else if(ch>='a'&&ch<='z') {
				lower = true;
			}
			else if(ch>='0'&&ch<='9') {
				numeric = true;
			}
			else if(ch!=' ') {
				special = true;
			}
			
			
		}
		
		if(upper && lower && numeric && special) {
			return true;
		}
		
		
		return false;
	}
}
