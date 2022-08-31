package com.java;

public class MainSides {
	  public static void main(String args[]) {
		  Rectangle rect=new Rectangle(9,8);
		  Squaree sq = new Squaree(5);
		  
		  System.out.println("The area of rectangle is " +rect.getArea());
		  System.out.println("The perimeter of rectangle is " +rect.getPerimeter());
		  System.out.println("The area of squre is " +sq.getAreaSq());
		  System.out.println("The perimeter of squre is " +sq.getPeriSq());

	  }
	}
