package com.java;
/*Write a Java program to test whether there are two integers x and y
 *  such that x^2 + y^2 is equal to a given positive number.*/
import java.util.Scanner;
public class SumPower {
	public static void main(String args[]) {
		int x,y,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer");
		x=sc.nextInt();
		System.out.println("Enter the second integer");
		y=sc.nextInt();
		System.out.println("Enter the number");
		num=sc.nextInt();
		int z=x*x+y*y;
		if(z==num) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
	}

}
