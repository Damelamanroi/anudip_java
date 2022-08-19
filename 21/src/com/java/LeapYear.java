package com.java;

public class LeapYear {
	public static void main(String args[]) {
		int year = 2016;
		if((year % 400 == 0)||(year % 4 == 0) ) {
			System.out.println(year + " : Leap Year");
		}
		else if(year % 100 != 0) {
			System.out.println(year + " :It is not Leap Year");
		}
		
		else {
			System.out.println(year + " :It is not Leap Year");
		}
	
	}
}
