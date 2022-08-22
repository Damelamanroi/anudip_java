package com.java;
import java.util.Scanner;
public class Multipliaction {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=num.nextInt();
		int y;
		System.out.println("The multiplication Table is :");
		for(y =0 ; y<=x; y++) {
			
			System.out.println(x+" X " +y+ " = " +(x*y));
		}
	}
}
