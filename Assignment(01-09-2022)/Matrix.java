package com.java;
/*WAP to input an array having 3 rows and 3 columns of type String*/
import java.util.Arrays;
public class Matrix {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6}};
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				System.out.println("[" + i + "] [" + j + "] = " +matrix[i][j] );
			}
		}
	} 
}
