
//This program is to print the largest sum contiguous subarray

package com.problems.tapAcademy.codingTask.day01;

import java.util.Scanner;

public class LargestSumContiguousSubArray {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Longest Subarray ");
		
		//calling the method
		longestSubArray(arr);
		
		System.out.println();
		
		scan.close();
	}

	
	
	//this code uses the kadane's algorithm, so that we can find the 
	//solution in better complexity
	private static void longestSubArray(int[] arr) {

		//to store the maximum subarray sum
		int max = Integer.MIN_VALUE;
		
		//to keep track of continuous sum
		int sum = 0;
		
		//to store the start of every new sum temporarly
		int tStart = -1;
		
		//to store the final start and end sum indexes
		int start = -1;
		int end = -1;
		
		//this iteration helps to find the largest sum subarray
		for(int i = 0;i<arr.length;i++) {
			
			//if we encounter sum equals to zero,
			//that means, we need to start new sum
			//and to hold the start index of that sum
			if(sum==0) {
				tStart = i;
			}
			
			sum = sum + arr[i];	
			
			//storing the maximum sum
			//keeping track of start and end index 
			//using temporary start and local i
			if(sum>max) {
				max = sum;
				start = tStart;
				end = i;
			}
			
			//if the sum is negative means, there is no need
			//to carry it because the new result will be reduced
			if(sum<0) {
				sum = 0;
			}	
		}
		System.out.println("Sum: "+max);
		System.out.print("SubArray: ");
		for(int i = start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
		return;
	}
}




//i/p & o/p
//Enter Array Size: 5
//Enter elements: 
//-1 -3 4 -1 2
//Longest Subarray 
//Sum: 5
//SubArray: 4 -1 2 
