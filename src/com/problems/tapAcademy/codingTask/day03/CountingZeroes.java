package com.problems.tapAcademy.codingTask.day03;

public class CountingZeroes {

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,1,1,1,1,0,0};
		
		//output: 6
		int result = countZeroes(arr);
		System.out.println(result);
	}

	private static int countZeroes(int[] arr) {
	
		
		//implementing the binary search array
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			//if we encounter 1 in mid index, then we need update low
			//until we cross
			if(arr[mid]==1) {
				
				low = mid+1;
				
			}
			//if we encounter 0 in mid index then we need to update high
			//until we cross
			else {
				high = mid-1;
			}
			
		}
		
		
		//finally if they cross then we found the length of the 1's subarray
		//so with the help of than we can find the zero count
		return (arr.length-1)-high;
	}
	
}
