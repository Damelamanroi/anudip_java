package com.Vehicle.java;
/*1. Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car
respectively with content of the super class’s showData ( ) method.
 */
public class VehicleMain {
	public static void main(String args[]) {
		Bus tata=new Bus("ZOO80",5873,180,"Red","Loda");
		Cars bugati=new Cars("Bugati",8095,900,"Blue","Michael");

		tata.showData();
		bugati.showData();
	}
}
