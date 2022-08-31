package com.Vehicle.java;

public class Vehicle {
	protected int regnNumber;
	 protected double speed;
	 protected String color;
	 protected String ownerName;
	 Vehicle(int regnNumber,double speed,String color,String ownerName){
		 this.regnNumber=regnNumber;
		 this.speed=speed;
		 this.color=color;
		 this.ownerName=ownerName;
	 }
	 public void showData() {
		 System.out.println("\tThis is a vehicle class ");
	 }
}
