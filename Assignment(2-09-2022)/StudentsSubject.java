package com.java;
/* Write a program to print the roll number and average marks
 *  of 8 students in three subjects (each out of 100)
 .The marks are entered by user.*/
import java.util.Scanner;
public class StudentsSubject {
	public static void main(String ags[]) {
	int rollno, subj1,subj2,subj3;
	int avg;
	Scanner input=new Scanner(System.in);
	
		for(int j=0;j<8;j++) {
			
			System.out.println("Enter the  roll Number:");
			rollno=input.nextInt();
			System.out.println("Enter the  marks of Subject1:");
			subj1=input.nextInt();
			System.out.println("Enter the marks of Subject2:");
			subj2=input.nextInt();
			System.out.println("Enter the marks of Subject 3 :");
			subj3=input.nextInt();
			avg=(subj1+subj2+subj3)/3;
			System.out.println("The average marks rollno  "+rollno+ " is:"+avg);
		}	
	
	
	}
}
