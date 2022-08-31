package com.java;
/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method
 *  named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.*/
import java.util.Scanner;

public class Rectangle {
	public static void main(String args[]) {
		Scanner num= new Scanner(System.in);
		
		Area a=new Area();
		
		System.out.println("Enter the length :");
		int le=num.nextInt();
		System.out.println("Enter the breadth :");
		 int br=num.nextInt();
		a.setDim( le,  br);
		
		System.out.println("The area of the rectangle:" +a.getArea());
		
	}

}
