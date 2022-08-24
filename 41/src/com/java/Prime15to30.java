package com.java;

public class Prime15to30 {
	public static void main(String args[]) {
		String primeNumbers="";
		int i=0;
		int j=0;
		int counter=0;
		for( i=15; i<=30;i++) {
			
			for( j=i;j>=1;j--) {
			if (i%j== 0) {
				counter = counter+1;
			}
			}
			if(counter==2) {
				 primeNumbers =primeNumbers + i + " ";
			}
			
		}
		System.out.println(primeNumbers);
	}
}
