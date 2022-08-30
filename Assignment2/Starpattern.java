package com.java;
/*WAP to display 
* * * * * 
* * * * 
* * * 
* * 
* 
			*/
import java.util.Scanner;
public class Starpattern {
	public static void main(String args[]) {
		Scanner num= new Scanner (System.in);
		int rows,i,j;
		rows= num.nextInt();
		for(i=rows-1;i>=0;i--) {
			for(j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
	}
}
	}