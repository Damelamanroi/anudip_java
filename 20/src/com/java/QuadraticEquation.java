package com.java;
import static java.lang.Math.*; 

public class QuadraticEquation {
	public static void main(String args[]) {
		double a=1, b=-1, c=1;
		double first, second, real, imag;
		double det = b*b - 4*a*c;
		if(det>0) {
			first= (-b + Math.sqrt(det)) / (2*a);
			second= (-b - Math.sqrt(det)) / (2*a);
			System.out.println("The first root is :" +first);
			System.out.println("The second root is :" +second);
			System.out.println("The both roots are real and different");
		}
		else if(det==0){
			first = second = -b /(2*a);
			System.out.println("The roots of the equation are real and same");
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
