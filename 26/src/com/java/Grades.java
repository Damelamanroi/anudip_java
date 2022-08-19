package com.java;

public class Grades {
	public static void main(String args[]) {
		int marks=59;
		if(marks<100 && marks>90) {
			System.out.println("The grade of the Student is: A+" );
		}
		else if(marks<90 && marks>80) {	
			System.out.println("The grade of the Student is: A" );
		}
		else if(marks<80 && marks >70) {
			System.out.println("The grade of the Student is: B+" );
		}
		else if(marks<70 && marks >60) {
			System.out.println("The grade of the Student is: B" );
		}
		else if(marks<60 && marks>50) {
			System.out.println("The grade of the Student is: C" );
		}
		else if(marks<50 && marks>40) {
			System.out.println("The grade of the Student is: D" );
		}
		else if(marks<40 && marks>30) {
			System.out.println("The grade of the Student is: E" );
		}
		else{
			System.out.println("The grade of the Student is: F" );
		}
	}
}
