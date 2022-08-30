package com.java;

import java.util.Scanner;
/*Write a program to calculate the sum of following series where n is input by user. */
public class SumofN {
	public static void main(String args[])
	{
			 double sum=0;
			  int x;
			  Scanner num=new Scanner(System.in);
			  x=num.nextInt();
			  for(int i=2;i<=x;i++)
			  {
				  sum=sum+(1+(1/i));
				  
			  }
			  
			  System.out.println(sum);
			  
		
	}
}


