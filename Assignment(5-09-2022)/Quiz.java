package com.java;
/*Consider a Quiz Management System, where a user needs to answer 5 questions. 

If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”*/
import java.util.Scanner;
public class Quiz {
	void check() throws IncorrectException
	{
		String question[]= {"What is the highest Mountain","what is java?","which is the largest river", "The earth is", "What  is the largest planet"};
		String option1[]= {"Mt. Everst","object oriented language","nile river", "round","Juipter"};
		String option2[]= {"Makalu","procedural oriented language","sfsfg","flat","Mars"};
		for(int i=0;i<question.length;i++)
		{
			String ques=question[i];
			System.out.println(ques);
			System.out.println(option1[i]);
			System.out.println(option2[i]);
			Scanner num=new Scanner(System.in);
			System.out.println("Enter your choice");
			String choice=num.nextLine();
				if(!(choice.equals(option1[i]))) {
				throw new IncorrectException("Wrong answer");
			}else {
				System.out.println("Correct");
			}
		}
	}
	public static void main(String args[]) {
		{
			Quiz op=new Quiz();
			try {
				op.check();
			} catch (IncorrectException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
}
