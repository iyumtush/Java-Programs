package JavaQuestions;

import java.util.Scanner;

public class CheckPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean isPrime = true;
		
		
		if(num <= 1) // Number should be greater then 1 if not set false
		{
			isPrime = false;
		} else
		{
			for(int i = 2 ; i < num;i++)
			{
				if(num % i == 0) // Number should not divisible by any number lower the
				{                // entered number if divisible set false
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) // if every thing good as per the initial set value of isPrime = true
			        // then print "Prime" else print "Not Prime"
		{
			System.out.println(num+" is a prime number");
		}else
		{
			System.out.println(num+" is not a prime number");
		}
	}

}
