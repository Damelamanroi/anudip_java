package com.java;

public class Rectangle {
	private int length=45,breadth=69;
	Rectangle(){
		  System.out.println("Area = " +length*breadth);
	}
	Rectangle(int length,int breadth){
		  this.length=length;
		  this.breadth=breadth;
		  System.out.println("New Area = " +this.length*this.breadth);

	  }
}
