package com.problems.tapAcademy.codingTask.day03;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5,6,7,8,9};
		
		int result = findTheNumber(arr);
		System.out.println(result);
	}

	private static int findTheNumber(int[] arr) {
		
		//total sum of natural numbers
		int total = (arr.length+1)*(arr.length+2)/2;
		
		//this is to find the sum of array elements
		int sum = 0;
		for(int i:arr){
			
			sum = sum + i;
		}
		
		//if we subtract total with sum we get the missing number
		return total - sum;
	}
}
