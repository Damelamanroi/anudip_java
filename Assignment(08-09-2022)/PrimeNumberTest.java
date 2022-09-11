package com.java.unit.Project1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@ParameterizedTest
	@ValueSource(ints= {2,8,5,19,31})
	void test_primenum(int n){
		int i;
		int flag=0;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		assertTrue(flag==0);
		
	}
	

