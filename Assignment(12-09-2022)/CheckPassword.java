package com.algo.java;
/*Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.*/



import java.util.*; 


import java.util.Scanner;
public class CheckPassword {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	try
	{
	System.out.println("Enter Password : ");
	if(sc.nextLine().equals("Class"))
	{
	System.out.println("Authenticated -Password is Correct ");
	}
	else
	{
	throw new PasswordException("Authentication failure-Password is Incorrect");
	}
	}
	catch(PasswordException e)
	{
	System.out.println(e.getMessage());
	}
	
		} 
}
