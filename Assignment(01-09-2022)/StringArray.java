package com.java;
/*WAP to input an array having 5 strings and display them.
*/
import java.util.Arrays;
import java.util.Scanner;
public class StringArray {
	public static void main(String[] args) {
		int n;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=num.nextInt();
		int[] arr=new int[6];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			arr[i]=num.nextInt();
		}
		System.out.println("The elements are :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
