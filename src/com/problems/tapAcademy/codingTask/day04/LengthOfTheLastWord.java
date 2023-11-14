package com.problems.tapAcademy.codingTask.day04;

public class LengthOfTheLastWord {

	
	public static void main(String[] args) {
		
		String str = "india is my country     ";
		//output: 7;
		
		int result = findTheLength(str);
		System.out.println("length: "+result);
	}

	private static int findTheLength(String str) {

		
		//this is to count the length of the last word
		int count = 0;
		
		//we are operating from the last index of string
		int i = str.length()-1;
		
		
		//this loop helps to find the last word last charcter index
		while(i>=0) {
			
			if(str.charAt(i)!=' ') {
				break;
			}
			i--;
		}
		
		
		//this loop helps to find the last word first character index
		while(i>=0) {
			
			if(str.charAt(i)==' ') {
				
				break;
			}
			
			//counting until we found the space
			count++;
			i--;
		}
		
		
		return count;
	}
	
	
}
