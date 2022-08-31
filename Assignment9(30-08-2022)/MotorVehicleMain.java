package com.Motor;


/* 3.Create an abstract class MotorVehicle with the following details:
Data Members:
(a) modelName (b)modelNumber (c) modelPrice
Methods:
(a) display() to show all the details
Create a subclass of this class Carthat inherits the class MotorVehicle and add the
following details:
Data Members:
(b) discountRate
Methods:
(a) display() method to display the Car name, model number, price and the discount
rate.
(b) discount() method to compute the discount.
 */
public class MotorVehicleMain {
	public static void main(String args[]) {
		 MotorCar mot = new MotorCar(10.0,"Toyota","prius","SW20",950000);
		 mot.display();
		 mot.discount();
	 }
}
