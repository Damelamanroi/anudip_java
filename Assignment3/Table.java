package com.java;
/*WAP to display the Time Table from 1-10*/
public class Table {
	public static void main(String args[]) {
		System.out.println("The Table of the  Number 1-10 :");
		for(int i=1; i<=10;i++) {
			for (int j=0;j<=10;j++) {
				System.out.println(i+" X " +j+ " = " +(i*j));
			}
			System.out.println();
		}
	}
}
