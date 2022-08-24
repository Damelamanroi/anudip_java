package com.java;

import java.util.Scanner;
public class TriangleNumber {
	public static void main(String args[]) {
		int i,j,rows,num=1;
		Scanner row=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows=row.nextInt();
		for(i=1;i<=rows; i++) {
		
			for(j=1;j<i+1;j++) {
				System.out.print(num++ +" ");
				
			}
			System.out.println();
		}
	}
}
