package com.problems.tapAcademy.codingTask.day01;

public class ReverseTheString {

	public static void main(String[] args) {
		
		
		String str = "i love my country";
//		output : 
//		result: yrtnuoc ym evol i
		
		String result = reverse(str);
		System.out.println("result: "+result);
	}

	private static String reverse(String str) {

		//i used this to achieve the efficient concatination
		StringBuilder temp = new StringBuilder("");
		
		for(int i = str.length()-1;i>=0;i--) {
			
			temp.append(str.charAt(i));
		}
		return temp.toString();
	}
}
