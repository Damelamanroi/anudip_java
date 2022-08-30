package com.java;

public class Nestedif {
	public static void main(String args[]) {
		int a=90, b= 70, c=50;
		if(a>b) {
			if(a>c) {
				System.out.println("The greatest nummber :" +a);
			}
			else {
				System.out.println("The greatest nummber :" +c);
			}
		}
		else if(b>a) {
			if(b>c) {
				System.out.println("The greatest nummber :" +b);
			}
			else {
				System.out.println("The greatest nummber :" +c);
			}
		}
		else {
			System.out.println("The greatest nummber :" +c);
		}
	}
}
