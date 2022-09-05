package com.java;

public class Amount {
	 int bal=500;
	public int bal() {
		return bal;
	}
	
	public void withDraw(int amount) throws LessBalanceException{
		if(amount > bal) {
			throw new LessBalanceException("The Current Balance is less than the Amount");
			
		}
		
	}
	public void Deposit(int deposit) throws LessBalanceException{
		if(deposit <= 0) {
			throw new LessBalanceException("The amount is invalid:");
		}
	}
}
