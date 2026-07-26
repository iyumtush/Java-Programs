package AdvJava;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the firts number : ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		
		int n2 = sc.nextInt();
		
		try {

			
		
		int r = n1 / n2;
		
	    System.out.println("The division of "+n1+" divided by "+n2+" is : "+r);
		
		
	        } catch(ArithmeticException e) {
	        	
	        	  System.out.println("Error ; Division by zero not possible");
	        	
	        } finally {
	        	
	        	sc.close();
	        	System.out.println("Finally block executed");
	        }

}
}