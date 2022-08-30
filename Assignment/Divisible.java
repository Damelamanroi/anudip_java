package com.java;
/*WAP to see if the number is  divisible by 3 and 5, 3 or 5*/
public class Divisible {
	public static void main(String args[])
	{
		int num=20;
		if (num % 3 == 0 && num % 5 == 0)
            System.out.println("The Number is divisible by 3 and 5");
        else if (num % 3 == 0)
            System.out.println("The Number is divisible by 3 but not by 5");
        else if (num % 5 == 0)
            System.out.println("The Number is divisible by 5 but not by 3");
        else
            System.out.println("The Number is neither divisible by 3 nor by 5");
	}
}
