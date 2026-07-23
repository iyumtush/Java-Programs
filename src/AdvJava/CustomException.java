package AdvJava;

import java.util.Scanner;

public class CustomException {

	
	
	
	public static void main(String[] args) {
		
		try 
		{    
			
			//it you want to add age from user
			
			/*Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter you age : ");
			
			int age = sc.nextInt();*/
			
			int age = 14;
			
			validateAge(age);
			System.out.println("Age is valid you can access the website. ");
		}
		catch(AgeToYoungException e)
		{
			System.out.println("Exception caught : "+e.getMessage());
		}
	}
		
		public static void validateAge(int age) throws AgeToYoungException {
			
		if(age < 18) {
			
			throw new AgeToYoungException("Age is less to access the website");
		}
			
			
	}
}
