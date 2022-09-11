package com.java.unit.Project1;

public class Student_Buisness {
	double calpercentage(Student s1) {
		double percen;
		int total_marks=300;
		percen=(s1.getMarks1()+s1.getMarks2()+s1.getMarks3())/total_marks*100;
		return percen;
		
		}
}
