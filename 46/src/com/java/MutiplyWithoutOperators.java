package com.java;
import java.util.Scanner;
public class MutiplyWithoutOperators {
	public static void main(String args[]) {
		int x,y,i,sum=0;
		System.out.println("Enter the two number:");
		Scanner num=new Scanner(System.in);
		x=num.nextInt();
		y=num.nextInt();
		System.out.println("The Multiplication of the number is :");
		for (i=1;i<=y;i++) {
			sum = sum + x ;
		}
		System.out.println(sum);
	}
}
