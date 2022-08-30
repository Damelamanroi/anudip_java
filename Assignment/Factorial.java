package com.java;
/*Write a java program to input a number and print its factorial*/
import java.util.Scanner;
public class Factorial {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=num.nextInt();
		
		int factorial=1;
		System.out.println("The factorial of the number " +x+ " is :");
		for (int i=1;i<=x;i++) {
			System.out.print( i+ " + ");
			factorial = factorial * i;
			
		}
		System.out.println(" = " +factorial);
	}
}
