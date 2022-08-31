package com.java;
/*Create a class called Complex, which has three private instance variables –real and
imaginary. It contains a method called add( ) which takes one Complex object as
parameter and print the added value of the calling Complex object and passed Complex
object. In the main method, declare two Complex objects and assign values using
constructor and call the add() method.*/
public class ComplexNumberMethod {
	double real;
	double img;
	ComplexNumberMethod(double real,double img){
		this.real=real;
		this.img=img;
	}
	public static ComplexNumberMethod add(ComplexNumberMethod cm1,ComplexNumberMethod cm2) {
		ComplexNumberMethod obj1=new ComplexNumberMethod(0,0);
		obj1.real=cm1.real + cm2.real; 
		obj1.img=cm1.img + cm2.img;
		
		return obj1;
	}
	public static ComplexNumberMethod multiply(ComplexNumberMethod cm1,ComplexNumberMethod cm2) {
		ComplexNumberMethod obj2=new ComplexNumberMethod(0,0);
		obj2.real=cm1.real * cm2.real;
		obj2.img=cm1.img * cm2.img;
		return obj2;
	}

public static void main(String args[]) {
	
	ComplexNumberMethod cm1=new ComplexNumberMethod(30,60);
	ComplexNumberMethod cm2=new ComplexNumberMethod(28,96);
	
	ComplexNumberMethod obj1 = add(cm1,cm2);
	ComplexNumberMethod obj2=multiply(cm1,cm2);
	
	System.out.println("The sum of the  two complex numbers:\n" +obj1.real+ "\n" +obj1.img+ "i");
	System.out.println("The multiplication of the  two complex number:\n" +obj2.real+ "\n" +obj2.img+ "i");

     }
 }
