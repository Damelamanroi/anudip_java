package com.java;

import java.util.Scanner;
public class NumberIncrement {
	public static void main(String args[]) {
		Scanner row=new Scanner(System.in);
		System.out.println("Enter the number of rows you want to print:");
		int i,j,rows=row.nextInt();	
		
		for(i=0;i<=rows;i++) {
			int num=1;
			for(j=0;j<=i;j++) {
				System.out.print( num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
