package com.java;

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
