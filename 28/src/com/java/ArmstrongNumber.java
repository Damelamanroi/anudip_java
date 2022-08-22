package com.java;

import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter a number=");
		int x=num.nextInt();
		int rem,sum=0,tmp=x;
		while(x!=0) {
			rem=x%10;
			sum=sum+(rem*rem*rem);
			x=x/10;
		}
		if(tmp==sum)
			System.out.println(sum+ ":It is an armstrong number");
		else
			System.out.println(sum+ ":It is not an armstrong number");
	}

	}
