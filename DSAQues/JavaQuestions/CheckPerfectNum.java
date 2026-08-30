package JavaQuestions;

import java.util.Scanner;

public class CheckPerfectNum 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i < num ; i++)
		{
			if(num % i == 0 ) //Check number the i 
				              //which create reminder "0"
			{
				sum += i;	 //Store the i which create reminder "0"
			}
		}
		if(sum == num) //Checks that the sum is equals to number
		{
			System.out.println(num+" is perfect number");
		}
		else
		{
			System.out.println(num+" is not perfect number");
		}	
	}
}
