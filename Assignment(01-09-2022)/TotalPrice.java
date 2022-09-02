package com.java;
import java.util.Scanner;
public class TotalPrice {
	public static void main(String args[]) {
		Items[] item=new Items[5];
		int c;
		int p,total_cost=0;
		Scanner num=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter the code for an item: " +(i+1) + ": ");
			c=num.nextInt();
			System.out.println("Enter the price for an item: " +(i+1) + ": ");
			p=num.nextInt();
			item[i]=new Items(c,p);
		}
		System.out.println("Code__________Items" );
		for(int i=0; i<5;i++) {
			//display
			System.out.print(item[i].code);
			System.out.println("\t"+item[i].price);
			//sum	
			total_cost=total_cost + item[i].price;
		}
		System.out.println("Total Cost : \t" +total_cost);
		}
}

