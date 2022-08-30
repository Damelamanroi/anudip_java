package com.java;
/*WAP to display the number of n natural numbers and the sum of it*/
import java.util.Scanner;
public class Naturalnumber {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int x=num.nextInt();
		int sum=0;
		System.out.println("The natural numbers = ");
		for(int i=1;i<=x;i++) {
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println();
		System.out.println("The sum of the natural numbers :" +sum);
		
	}
}
