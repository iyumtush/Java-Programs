package JavaQuestions;

import java.util.Scanner;

public class FindFactorailOfN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int factorial = 1;
		
		for(int i = 1 ; i <= num; i++) // started from 1 increment 1 till number
		{
			factorial *= i;// Multiply and stored each result in factorial and 
		}		           // end when i = number
		System.out.println("The factorial of the "+num+" is :"+factorial);
	}

}
