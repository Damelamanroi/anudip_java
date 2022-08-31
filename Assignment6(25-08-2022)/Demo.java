package com.java;

import java.util.Scanner;
public class Demo {
	public static void main(String args[]) {
		
		//printing the assign values
		
		Invoice item=new Invoice("60l", "CarToy",10 , 3);
		System.out.println("Part Number:" +item.getPartNumber() + "; \n Part Discription: " + item.getPartDiscription()+ "; \n Number of Items Sold: " + item.getQuantity()+ "; \n The Price of an Item: " + item.getPrice() + "; \n The Total Amount:" + item.getAmount());
		item.setPartNumber("500X64");
		item.setPartDiscription("Boxing Equiments");
		item.setQuantity(50);
		item.setPrice(1000);
		System.out.println("\nAnother Invoice after changing:");
		System.out.println("\nPart Number:" +item.getPartNumber() + "; \n Part Discription: " + item.getPartDiscription()+ "; \n Number of Items Sold: " + item.getQuantity()+ "; \n The Price of an Item: " + item.getPrice() + "; \n The Total Amount:" + item.getAmount());
		
		//inputting the values
		
		Scanner num= new Scanner(System.in);
		int qnty;
		double rs;
		String numb;
		String disc;
		System.out.println("\n\nEnter the values to put in the invoice:");
		numb=num.nextLine();
		disc=num.nextLine();
		qnty=num.nextInt();
		rs=num.nextDouble();
		
		item.setPartDiscription(disc);
		item.setPartNumber(numb);
		item.setPrice(rs);
		item.setQuantity(qnty);
		System.out.println("\nThe Invoice of the item is :");
		
		System.out.println("\n Part Number:" +item.getPartNumber() + "; \n Part Discription: " + item.getPartDiscription()+ "; \n Number of Items Sold: " + item.getQuantity()+ "; \n The Price of an Item: " + item.getPrice() + "; \n The Total Amount:" + item.getAmount());
	}
}
