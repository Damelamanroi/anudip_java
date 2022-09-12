package com.algo.java;
/*WAP to input a string and reverse it without using any inbuilt method.*/
public class StringReverse {
	public static void main(String args[]) {
		String s="HelloWorld";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			
			System.out.print(s.charAt(i));;
		}
	}
}
