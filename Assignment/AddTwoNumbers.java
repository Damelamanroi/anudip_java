package com.java;
/*Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.*/
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