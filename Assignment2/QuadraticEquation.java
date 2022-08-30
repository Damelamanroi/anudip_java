package com.java;
 
/*Write a Java program to solve quadratic equations and check whether the roots are positive,equal or negative (use if, else if and else).*/
public class QuadraticEquation {
	public static void main(String args[]) {
		double a=1, b=-5, c=1;
		double first, second, real, imag;
		double det = b*b - 4*a*c;
		if(det>0) {
			first= (-b + Math.sqrt(det)) / (2*a);
			second= (-b - Math.sqrt(det)) / (2*a);
			System.out.println("The first root is :" +first);
			System.out.println("The second root is :" +second);
			System.out.println("Both roots are real and different");
		}
		else if(det==0){
			first = second = -b /(2*a);
			System.out.println("Both the roots of the equation are real and same");
			System.out.println("first=second=" +first);
			}
		else{
			real = -b / (2 * a);
		    imag = Math.sqrt(-det) / (2 * a);
		    System.out.println("first = " +real );
		    System.out.println("first imaginary = " +imag);
		    System.out.println("second = " +real);
		    System.out.println("second imaginary = " +imag);
		}
	}
}
