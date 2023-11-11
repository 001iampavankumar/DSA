package com.problems.tapAcademy.codingTask.day02;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {-5,-1,6,7,12,15};
		int k = 7;
		
//		output
//		index: 3
		
		int result = binarySearch(arr,k);
		System.out.println("index: "+result);
	}

	private static int binarySearch(int[] arr,int k) {

		//it is an divide and conquer process
		//so we need first and last index of array parts
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			//this helps to divide the array and search efficiently
			int mid = (low+high)/2;
			
			if(arr[mid]==k) {
				return mid;
			}
			
			//if we encounter that k is greater then no need to check
			//below mid index values
			else if(arr[mid]<k) {
				
				low = mid+1;
			}
			//same goes here,no need to check above mid index values
			else {
				high = mid-1;
			}	
		}
		
		//if we dont find it then returning the -1
		return -1;
	}
}
