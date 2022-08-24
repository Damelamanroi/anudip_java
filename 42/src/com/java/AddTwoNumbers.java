package com.java;
import java.util.Scanner;
public class AddTwoNumbers {
	public static void main(String args[])
	{
		char choice;
		Scanner num=new Scanner(System.in);
		int c;
		
			do
			{
				System.out.println("enter the fist number");
				int a=num.nextInt();
				System.out.println("enter the second number");
				int b=num.nextInt();
				c=a+b;
				System.out.println(c);
				System.out.println("Type y-yes or n-no to show the sum:");
				choice=num.next().charAt(0);
				
			}while(choice=='y' || choice=='Y');
			System.out.println(c);
}
}