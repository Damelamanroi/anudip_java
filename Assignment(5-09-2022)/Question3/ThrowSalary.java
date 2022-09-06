package com.java;
/*WAP to input the salary of an employee and if the salary
 is not in the range of 10,000 to 20,000 an invalid salary
  exception should be thrown*/

public class ThrowSalary {
	static void checkSalary(int sal) throws InvalidSalaryException {
		if(!(sal>=10000 && sal<=20000)){
			throw new InvalidSalaryException("Salary is invalid");
		}else {
			System.out.println("Salary is valid");
		}
	}
	public static void main(String args[]) {
		try {
			ThrowSalary.checkSalary(12000);
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
	}
	}	


