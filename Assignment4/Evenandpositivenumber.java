package com.java;
/*WAP to see if the number is a negative and an even number, even and not negative number
 * and neither*/
 
public class Evenandpositivenumber {
	public static void main(String args[])
	{
		int x= -2;
		if(x%2==0) {
			if(x<0) {
			System.out.println("Is even and negative nummber :" +x);
		}
		else {
			System.out.println("is even and not negative nummber :" +x);
		}
	}
		else {
			System.out.println("Is neither negative nor and even number :" +x);}
		}
}
