package JavaQuestions;

import java.util.Scanner;

public class FindLCMOfNumbers 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the first number : ");
		int num2 = sc.nextInt();
		int LCM = 0 ;
				
		for(int i = 1 ; i <= num1 * num2 ; i++)
		{
			if(i % num1 == 0 && i % num2  == 0)
			{
					LCM = i;
					break ;		
			}
		}
		System.out.print("\nThe GCD of "+num1+" & "+num2+" is : "+LCM);
	}
}


