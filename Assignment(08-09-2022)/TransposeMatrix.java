package com.java.unit.Project1;
/*Write a java program to print transpose of a matrix*/
public class TransposeMatrix {
  
		public static void main(String args[]){  
		 
		int matrix[][]={{1,3,4,5},{2,4,3,5},{3,4,5,6},{4,5,6,7}};    
		    
		
		int transpose[][]=new int[4][4]; //making an array obj   
		    
		  
		for(int i=0;i<4;i++){
			
			for(int j=0;j<4;j++){    
				transpose[i][j]=matrix[j][i];  
			}    
		}    
		  
		System.out.println("Printing the matrix:");  
		
		for(int i=0;i<4;i++){
			
				for(int j=0;j<4;j++){    
					System.out.print(matrix[i][j]+" ");    
				}    
				System.out.println();    
		}    
			System.out.println("Printing Transpose Matrix  :");  
			
			
		for(int i=0;i<4;i++){
			
				for(int j=0;j<4;j++){ 
				
				System.out.print(transpose[i][j]+" ");    
				}    
				System.out.println();    
				}    
			}
		}  

