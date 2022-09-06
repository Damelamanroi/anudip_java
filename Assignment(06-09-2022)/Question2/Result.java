package com.java;

class Result extends Student implements Exam{
	public void Percent_cal() {
		double parcentage;
		parcentage=(marks1+marks2)/2;
		System.out.println("Percentage="+parcentage);
	}
	void perdisplay(){
		System.out.println("Name-"+name);
		System.out.println("Roll No-"+roll_no);
		System.out.println("Physics - " +marks1+ " \n Economics- "+marks2);
		
	}
}
