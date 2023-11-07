package com.patterns;

import java.util.Scanner;

class Patterns22 {

	public void pattern01(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern02(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern03(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void pattern04(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public void pattern05(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern06(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void pattern07(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			for (int s = 1; s <= n - i; s++) {

				System.out.print("  ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern08(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i >= 1; i--) {

			for (int s = 1; s <= n - i; s++) {

				System.out.print("  ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern09(int n) {
		// TODO Auto-generated method stub

		pattern07(n);
		pattern08(n);
	}

	public void pattern10(int n) {
		// TODO Auto-generated method stub

		pattern02(n);
		pattern05(n - 1);

	}

	public void pattern11(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			int num = 0;
			if (i % 2 != 0) {
				num = 1;
			}

			for (int j = 1; j <= i; j++) {

				if (num == 0) {
					System.out.print(0 + " ");
					num++;
				} else {
					System.out.print(1 + " ");
					num--;
				}
			}
			System.out.println();
		}
	}

	public void pattern12(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			// left side
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}

			// for middle spaces
			for (int s = 1; s <= n * 2 - i * 2; s++) {
				System.out.print("  ");
			}

			// for right side
			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();

		}

	}

	public void pattern13(int n) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(count++ + " ");
			}
			System.out.println();

		}

	}

	public void pattern14(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print((char) ((int) ('A') + j - 1) + " ");
			}
			System.out.println();
		}

	}

	public void pattern15(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print((char) ((int) ('A') + j - 1) + " ");
			}
			System.out.println();
		}

	}

	public void pattern16(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print((char) ((int) ('A') + i - 1) + " ");
			}
			System.out.println();
		}
	}

	public void pattern17(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			// for left spaces
			for (int s = 1; s <= n - i; s++) {
				System.out.print("  ");
			}

			// for increasing order
			for (int j = 1; j <= i; j++) {

				System.out.print((char) ((int) ('A') + j - 1) + " ");
			}

			// for decreasing order
			for (int j = i - 1; j >= 1; j--) {
				System.out.print((char) ((int) ('A') + j - 1) + " ");
			}
			System.out.println();
		}

	}

	public void pattern18(int n) {
		// TODO Auto-generated method stub

		for (int i = n; i >= 1; i--) {

			for (int j = i; j <= n; j++) {

				System.out.print((char) ((int) ('A') + j - 1) + " ");
			}
			System.out.println();
		}

	}

	public void pattern19(int n) {

		// upper part
		for (int i = n; i >= 1; i--) {

			// left side
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			// for middle spaces
			for (int s = 1; s <= n * 2 - i * 2; s++) {
				System.out.print("  ");
			}

			// for right side
			for (int j = i; j >= 1; j--) {

				System.out.print("* ");
			}
			System.out.println();

		}

		// lower part
		for (int i = 1; i <= n; i++) {

			// left side
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			// for middle spaces
			for (int s = 1; s <= n * 2 - i * 2; s++) {
				System.out.print("  ");
			}

			// for right side
			for (int j = i; j >= 1; j--) {

				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public void pattern20(int n) {
		// upper part
		for (int i = 1; i <= n; i++) {

			// left side
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			// for middle spaces
			for (int s = 1; s <= n * 2 - i * 2; s++) {
				System.out.print("  ");
			}

			// for right side
			for (int j = i; j >= 1; j--) {

				System.out.print("* ");
			}
			System.out.println();

		}
		// lower part
		for (int i = n - 1; i >= 1; i--) {

			// left side
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}

			// for middle spaces
			for (int s = 1; s <= n * 2 - i * 2; s++) {
				System.out.print("  ");
			}

			// for right side
			for (int j = i; j >= 1; j--) {

				System.out.print("* ");
			}
			System.out.println();

		}

	}

	
	public void pattern21(int n) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=n;i++) {
			
			for(int j = 1;j<=n;j++) {
				
				if(i==1||i==n||j==1||j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

	
	public void pattern22(int n) {
		// TODO Auto-generated method stub
		
		for(int i = n;i>=1;i--) {
			
			
			for(int s = n;s>i;s++) {
				System.out.print(s+" ");
			}
			
			for(int j = 1;j<i*2-1;j++) {
				
				System.out.print(i+" ");
			}
			
			for(int s = i+1;s<=n;s++) {
				System.out.print(s+" ");
			}
			System.out.println();
			
		}
		
		
	}

}

public class StriverPatterns {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter the n value: ");
		int n = scan.nextInt();
		Patterns22 sp = new Patterns22();

//		sp.pattern01(n);
//		sp.pattern02(n);
//		sp.pattern03(n);
//		sp.pattern04(n);
//		sp.pattern05(n);
//		sp.pattern06(n);
//		sp.pattern07(n);
//		sp.pattern08(n);
//		sp.pattern09(n);
//		sp.pattern10(n);
//		sp.pattern11(n);
//		sp.pattern12(n);
//		sp.pattern13(n);
//		sp.pattern14(n);
//		sp.pattern15(n);
//		sp.pattern16(n);
//		sp.pattern17(n);
//		sp.pattern18(n);
//		sp.pattern19(n);
//		sp.pattern20(n);
//		sp.pattern21(n);
		sp.pattern22(n);
	}

}
