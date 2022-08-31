package com.java;
/*Create a class complex having a real part(x) and an imaginary part(y). Provide methods to perform the following on complex numbers:

1. Add two complex numbers
2. Multiply two complex numbers

Note: In the methods pass the object of type complex and then do the addition and subtraction

Hint: you need to add the passed object with thr current object and same for multiplication*/
public class ComplexNumber {
	
		double real;
		double img;
		ComplexNumber(double real,double img){
			this.real=real;
			this.img=img;
		}

	public static void main(String args[]) {
		ComplexNumber num1=new ComplexNumber(100,90);
		ComplexNumber num2=new ComplexNumber(53,35);
	    double addreal=num1.real + num2.real;
	    double addimg=num1.img+num2.img;
	    
	    System.out.println("Addition of the  complex number:\n"+addreal+ "\n" +addimg+"i");
	    
	    double multiplyreal=num1.real * num2.real;
	    double multiplyimg=num1.img*num2.img;
	    
	    System.out.println("Multiplication of the complex number:\n"+multiplyreal+ "\n" +multiplyimg+"i");
	}
}

