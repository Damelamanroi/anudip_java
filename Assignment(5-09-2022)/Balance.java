package com.java;
/*Write a Java Program to Create Account with 500 Rs Minimum Balance
Create  a Class Called LessBalanceException Which returns the Statement 
that Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is 
more than the balance.*/
public class Balance {
	public static void main(String args[]) {
		Amount obj=new Amount();
		System.out.println("The Balance in the account is :" +obj.bal());
		System.out.println("The amount to withdraw is:1000");
		
		try {
			obj.withDraw(1000);
		} catch (LessBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
