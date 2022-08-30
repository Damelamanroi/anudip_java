package com.java;
/*Write a program in Java to display the cube of the number upto given an integer.*/
import java.util.Scanner;
public class Cube {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number:");
		int x=num.nextInt();
		
		for (int i=1; i<=x;i++) {
			System.out.println("The Cube of the Number " +i+ " is " +(i*i*i));
		}
	}
}
