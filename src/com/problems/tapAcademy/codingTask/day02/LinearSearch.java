package com.problems.tapAcademy.codingTask.day02;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {4,1,8,3,5,-1,7,6};
		int k = 5;
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]==k) {
				System.out.println("index: "+i);
				System.exit(0);
			}
		}
		
		System.out.println("index: "+(-1));
		
	}
}
