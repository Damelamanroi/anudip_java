package com.java;
/*WAP to input an array having 3 rows and 3 columns of type String*/
import java.util.Arrays;
public class Matrix {
		int[][] intArray = { { 1, 2,3 }, { 4,5,6 },{7,8,9}}; 
        
        System.out.println("Display the  array:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
            System.out.print(intArray [i][j] + " "); 
            } 
 
            System.out.println(); 
        } 
	} 
}
