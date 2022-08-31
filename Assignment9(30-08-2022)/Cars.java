package com.Vehicle.java;

public class Cars extends Vehicle {
	String manufacturerName;
	  Cars(String manufacturerName,int regnNumber,double speed,String color,String ownerName){
		  super(regnNumber,speed,color,ownerName);
		  this.manufacturerName=manufacturerName;
	  }
	  public void showData() {
//		  super.showData();
		  System.out.println("\tThe Manufacture name is: " +this.manufacturerName);
		  
		  System.out.println("The Reg Number is: " + this.regnNumber);

		  System.out.println("\tThe speed of the car is : " +this.speed);

		  System.out.println("The color is  :" +this.color);

		  System.out.println("\tThe owner name is :" +this.ownerName);

		  
	  }
}
