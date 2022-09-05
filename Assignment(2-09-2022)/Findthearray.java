package com.java;
/* Write a java program to input 5 elements of an array and search
 *  for a number whether it is present in an array or not. 
 * If present print its position in the array.*/
import java.util.Scanner;
public class Findthearray {
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int search;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value to search");
		search=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("the element is present at position"+(i+1));
				break;
				
			}
		}
	}
}

