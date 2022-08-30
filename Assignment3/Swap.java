package com.java;
/*Write a Java program to swap two variables.*/
public class Swap {
	public static void main(String args[]) {
		int x=5, y=8, temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println("Swapping Two Variables:");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
