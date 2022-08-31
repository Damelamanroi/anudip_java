package com.OOP.java;
/* Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();
Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦intweight;
◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦intyear;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//From the saleprice computed from Car class,subtract the manu facturer Discount.
 */
public class Main {
	 public static void main(String args[]) {
		 Truck truck=new Truck(500,300,500000,"Green");
		 Ford ford = new Ford(6519,100,150,50000000,"Black");
		 

		 System.out.println("The truck sale price after discount : "+truck.getSalePrice());
		 System.out.println("The ford sale price after discount : " +ford.getSalePrice());
	    
	}
}
