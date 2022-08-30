package com.java;
/*Write a java program to input a number and reverse it*/
import java.util.Scanner;
public class Reverse {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x,rem,rev=0;
		x=num.nextInt();
		while(x!=0) {
			rem=x%10;
			rev= rev *10+rem;
			x=x/10;
			
		}
		System.out.println("The number which is reverse is:" +rev );
		
		/*int x=1234;
		int rem,rev=0;
		rem = x%10;
		rev = rev*10 +rem;
		x =x/10;*/
		switch(rev) {
		case 1:{
			System.out.println(rev);
			
		}
		case 2:{
			System.out.println(rev);
		}
		}
	}
}
