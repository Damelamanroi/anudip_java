package com.java;
import java.util.Scanner;

public class PrimeOrNotPrime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		boolean flag=false;
		if(num==1)
		{
			System.out.println("Not a prime number");
		}else {
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not a prime number");
				flag=true;
			break;
			}
			
		}
		if(flag==false) {
			System.out.println("Prime number");
		}
		}
	}
}
