package com.java;
/*Consider a Library Management System, where a user wants to find a book. If the
book is present in Library (Hint: Use predefined array), then it will print the book.
Otherwise it will throw an exception “BookNotFoundException”.*/
import java.util.Scanner;

public class CheckBook {	
			
	String books[]= {"Bookno1","Bookno2","Bookno3","Bookno4"};	
	
	void check(String search) throws BookNotFoundException
		{
				for(int i=0;i<books.length;i++)
			{
					if(!(search.equals(books[i]))) {
						throw new BookNotFoundException("Book Not Found");
					
				}
					
					else {
					System.out.print("The book" +books[i]+  "is found");
				}
				
				}
		}
	public static void main(String args[]) {
		{
			Scanner num=new Scanner(System.in);
			System.out.println("Enter the Book :");
			String bookname=num.nextLine();
			CheckBook ch=new CheckBook();
			
			
			try {
					ch.check(bookname);
				
			} catch (BookNotFoundException e) {
			
				System.out.println(e.getMessage());
			}
		}
	}
}
