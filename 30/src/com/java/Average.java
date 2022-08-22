package com.java;
import java.util.Scanner;
public class Average {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		int a,b,c,d,e,sum=0,average=0;
		System.out.println("Enter 5 Numbers: ");
		a=num.nextInt();
		System.out.println();
		b=num.nextInt();
		System.out.println();
		c=num.nextInt();
		System.out.println();
		d=num.nextInt();
		System.out.println();
		e=num.nextInt();
		sum=a+b+c+d+e;
		System.out.println("The sum of Five numbers : " +sum);
		average=sum/5;
		System.out.println("The average of the Five numbers :" +average);
	}

}
