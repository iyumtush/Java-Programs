package JavaQuestions;

import java.util.Scanner;

public class FindGCDOfNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		long num1 = Math.abs((long) sc.nextInt());
		
		System.out.print("Enter the second number : ");
		long num2 = Math.abs((long) sc.nextInt());
		
		while(num2 != 0)
		{
			long remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}
		
		System.out.print("\nThe GCD is : "+num1);
	}

}
