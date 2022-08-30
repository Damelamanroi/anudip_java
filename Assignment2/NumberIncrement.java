package com.java;
/*WAP to display 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 */
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
