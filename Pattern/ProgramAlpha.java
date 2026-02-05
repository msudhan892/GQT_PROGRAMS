package com.gqt.gqtcorejava.Pattern;

import java.util.Scanner;

public class ProgramAlpha {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of n :");
		int n = sc.nextInt();
		// outer loop
		for (int i=0;i<n;i++) {
			// inner loop 
			//W
			for (int j=0;j<n;j++) {
				// condition
				if (j==0 || j==n-1|| i+j==n-1 && i>=n/2 || i==j && i>=n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			//E
			System.out.print("  ");
			for (int j=0;j<n;j++) {
				// condition 
				//E
				if ((i==0 && j!=0)|| (i==n-1 && j!=0) || (j==0 && i!=0 & i!=n-1) || i==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			
			}//L
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if (j==0 || i==n-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			
				//C
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if ((i==0 && j!=0) || (i==n-1 && j!=0) || (j==0 && i!=n-1 && i!=0)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				//O
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if (i==0 && j!=0 && j!=n-1||j==0 && i!=0 && i!=n-1|| i==n-1 && j!=n-1 && j!=0|| j==n-1 && i!=0 && i!=n-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				//M
				
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if (j==0 || i==j && j<=n/2 || j==n-1 || i+j==n-1 && j>=n/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				//E
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition 
					//E
					if ((i==0 && j!=0)|| (i==n-1 && j!=0) || (j==0 && i!=0 & i!=n-1) || i==n/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				
				}
				
				//space
//G
				
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					System.out.print(" ");
					
				}
				
				//G
				
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if (i==0 && j!=0 || j==0 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i>n/2 && i!=n-1 || i==n/2 && j>n/2 && j!=n-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				//Q
				
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if ((i==0 && j>0 && j<n-1) || (i==n-2 && j>0 && j<n-1) || (j==0 && i>0 && i<n-2) || (j==n-1 && i>0 && i<n-2) || (i==j && i>=n/2)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
				//T
				System.out.print("  ");
				for (int j=0;j<n;j++) {
					// condition
					if (i==0 || j==n/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			
			System.out.println();
				}
			
		}			

}
