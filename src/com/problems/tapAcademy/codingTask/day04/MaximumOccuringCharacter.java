package com.problems.tapAcademy.codingTask.day04;

import java.util.HashMap;
import java.util.Set;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		
		String str = "bananann";
		
		char result = findTheCharacter(str);
		System.out.println("result: "+result);
	}

	private static char findTheCharacter(String str) {
		
		//it will help to count the occueances of each character
		HashMap<Character,Integer> map = new HashMap<>();
		
		//in order to find the maximum repeated character count
		int max = -1;
		
		char ch;
		
		//this will help to return the result
		char res = '1';
		
		
		//storing the occurances
		for(int i = 0;i<str.length();i++) {
			
			ch = str.charAt(i);
			
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		Set<Character> set = map.keySet();
		
		for(char i:set) {
			
			if(map.get(i)>max) {
				max = map.get(i);
				res = i;
			}
			
		}
		return res;
	}
}
