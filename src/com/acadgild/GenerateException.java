package com.acadgild;

import java.util.Scanner;
/*
 * 1. Write a program to generate a user-defined exception called
 * NegativeAgeException if the user inputs negative value for age.
 * Generating NegativeAgeException if user inputs negative value for age.
 */
public class GenerateException {

	public static void main (String[] args) throws NegativeAgeException{
		// TODO Auto-generated method stub
		
		//Initializing new scanner to take input from user.
		Scanner user = new Scanner(System.in);
			
			//Ask user to provide his age
			System.out.println("What is your age?");
			int age = user.nextInt();	//Assign user input to name
		
			user.close();				//Scanner must be closed when done with user input.
			
			if(age<0) 					//throws exception if user input is negative (<0)
				throw new NegativeAgeException();
			
			//Displays this message if there's no exception
			System.out.println("Your are " +age+ " years old.");
	}
}


class NegativeAgeException extends Exception{
	/**
	 * Serializable class requires a static final serialVersionUID field of type long
	 * generated the ID with the help of eclipse IDE.
	 */
	private static final long serialVersionUID = 5846278146194583295L;
	
	@Override
	//If exception isn't caught, this message will be shown.
	public String getMessage (){
		return super.getMessage()+" age can't be a negative number";
	}
}