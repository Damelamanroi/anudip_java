package com.algo.java;
/**/


import java.util.Scanner;


public class FindCharc {
	public static void main(String args[]) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter the Sting");
		String s=num.nextLine();
		
		System.out.println("Enter the character ");
		char ch=num.next().charAt(0);
		
		int flag=0;
		int i;
		
		
		for( i =0;i<s.length();i++)
		
			if(s.charAt(i) == ch) {
			flag=1;
			break;
			
		}
			
			if(flag==1) {
				System.out.println("The character at found at index " +i);
		}
			else {
				System.out.println("The character is not found ");
		}
		
	}
}
