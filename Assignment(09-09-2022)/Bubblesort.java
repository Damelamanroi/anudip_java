package com.algo.java;

public class Bubblesort {
	   public static void bubbleSort(int arr[]) {
		   int i,j,temp;
		   for(i=0;i<arr.length;i++) {
			   for(j=i+1;j<arr.length;j++) {
				   if(arr[i]>arr[j]) {
					   temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }
	   }
	   public static void main(String args[]) {
		   int arr[]= {50,88,105,-97,80};
		   bubbleSort(arr);
		   for(int i=0;i<arr.length;i++) {
			   System.out.println(arr[i]);
		   }
	   }
	}
