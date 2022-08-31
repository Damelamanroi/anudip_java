package com.Motor;

abstract class MotorVehicle {
		 String modelName;
		 String modelNumber;
		 double modelPrice;
		 MotorVehicle(String modelName,String modelNumber,double modelPrice){
			 this.modelName=modelName;
			 this.modelNumber=modelNumber;
			 this.modelPrice=modelPrice;
		 }
	 public abstract void display() ;

}
