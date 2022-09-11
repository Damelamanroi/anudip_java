package com.java.unit.Project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Buisness_logic {
	Student s1=new Student();
	Student_Buisness su=new Student_Buisness();
	
	

		@Test
		void test() {
			s1.setName("Rahul");
			s1.setMarks1(20);
			s1.setMarks2(20);
			s1.setMarks3(20);
			double p=su.calpercentage(s1);
			assertEquals(20,p);
		}
}
