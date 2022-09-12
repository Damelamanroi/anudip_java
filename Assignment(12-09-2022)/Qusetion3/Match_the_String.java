package com.algo.java;
/*Write a program to throw a user-defined exception "String Mismatch Exception", 
 * if two strings are not equal (ignore the case).*/
import java.util.Scanner;
public class Match_the_String {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string :: ");
		String input = scan.nextLine();
		
		try {
			if(input.equalsIgnoreCase("FullStack Java"))
				System.out.println("String matched !!!");
			else
				throw new StringException("String not matched ???");
		}
		catch (StringException s) {
			System.out.println(s);
		}
	}
}
