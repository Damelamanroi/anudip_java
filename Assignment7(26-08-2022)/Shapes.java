package com.java;
/*Create a class called Shape which has a property side.
Create a subclass of Shape called Square which should use the property of 
Shape class to display area of square
Note: Take input*/


import java.util.Scanner;
public class Shapes {
	public static void main(String args[]) {
		Square sq=new Square();
		
		Scanner num = new Scanner(System.in);
		
		
		sq.show();
		sq.a=num.nextInt();
		sq.area();
		
	}
	
}
