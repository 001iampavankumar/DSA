package com.problems.tapAcademy.codingTask.day02;

public class AlternativelyMergeStrings {

	public static void main(String[] args) {
		
		String s1 = "geeks";
		String s2 = "forgeeks";
		
//		output:
//			result: gfeoerkgseeks
		
		
		//calling method
		String result = merger(s1,s2);
		System.out.println("result: "+result);
	}

	private static String merger(String s1, String s2) {

		//this is a two pointer approach
		int i = 0;
		int j = 0;
		
		
		//this is for efficient concatination
		StringBuilder temp = new StringBuilder("");
		
		
		//merging until one of string become empty or both
		while(i<s1.length()&&j<s2.length()) {
			
			temp.append(s1.charAt(i++));
			temp.append(s2.charAt(j++));
			
		}
		
		
		//these block of code is for leftout characters
		while(i<s1.length()) {
			temp.append(s1.charAt(i++));
		}
		while(j<s2.length()) {
			temp.append(s2.charAt(j++));
		}
		
		
		return temp.toString();
	}
}
