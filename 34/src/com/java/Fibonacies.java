package com.java;

public class Fibonacies {
	public static void main(String args[]) {
		 int x = 0;
		    int y = 1;

		    do
		 {
		        System.out.println(x);
		        y = x + y;
		        if (y < 100)
		        {
		            System.out.println(y);
		        }
		        x = x + y;
		    } while (x < 100);
	}
}
