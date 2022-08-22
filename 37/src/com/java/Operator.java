package com.java;
import java.util.Scanner;
public class Operator {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		int x,y,output=0;
		System.out.println("Enter the two number:");
		x=num.nextInt();
		y=num.nextInt();
		System.out.println("Enter the operator:");
		char sign;
		sign=num.next().charAt(0);
		switch(sign) {
		case '+':
			output = x + y;
			break;
		case '-':
			output = x - y;
			break;
		case '*':
			output = x * y;
			break;
		case '/':
			output = x / y;
			break;
		default:
			System.out.println("You have enter an Incorrect Operator");
		return;
		}
		
	System.out.println("The output of the two numbers is :" +output);
	}

}
