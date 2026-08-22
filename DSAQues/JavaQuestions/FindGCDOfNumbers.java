package JavaQuestions;

import java.util.Scanner;

public class FindGCDOfNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the first number : ");
		int num2 = sc.nextInt();
		
		int limit = 0;
		int biggest = 0;
		int GCD = 0 ;
		
		if(num1 > num2 )
		{
			limit = num1;
		}
		else
		{
			limit = num2;
		}
		for(int i = 1 ; i < limit ; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				if(i > biggest)
				{
					GCD = i;
				}			
			}
		}		
		System.out.print("\nThe GCD of "+num1+" & "+num2+" is : "+GCD);
	}

}
