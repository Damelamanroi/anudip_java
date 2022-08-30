package com.java;
/*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not 
 * a letter (between a and z or A and Z), print an error message*/
import java.util.Scanner;
public class Vowels {
	public static void main(String args[]) {
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z') ) {
			
			System.out.println("Error");
		}else {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println("vowel");
			}else {
				System.out.println("consonant");
			}
		}
	}
}
