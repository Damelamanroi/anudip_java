package com.java;
/*Screenshot(11) diagram*/
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter name=");
		Result rs=new Result();
		rs.name=num.nextLine();
		System.out.println("Enter RollNo=");
		rs.roll_no=num.nextInt();
		System.out.println("Enter Marks1=");
		rs.marks1=num.nextInt();
		System.out.println("Enter Marks2=");
		rs.marks2=num.nextInt();
		rs.perdisplay();
		rs.Percent_cal();
	}
}
