package com.java.unit.Project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Buisness_logic {
	Student s1=new Student();
	Student_Buisness su=new Student_Buisness();
	
	

		@Test
		void test() {
			s1.setName("Sam");
			s1.setMarks1(70);
			s1.setMarks2(70);
			s1.setMarks3(70);
			double p=su.calpercentage(s1);
			assertEquals(70,p);
		}
}
