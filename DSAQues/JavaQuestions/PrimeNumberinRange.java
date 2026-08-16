package JavaQuestions;

import java.util.Scanner;

public class PrimeNumberinRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the intial number : ");
		int r1 = sc.nextInt();
		System.out.println("Enter the last number : ");
		int r2 = sc.nextInt();

		for(int i = r1 ; i <=r2 ; i++) 
		 {	
			boolean isPrime = true;
			if(i < 2)
			{
				isPrime = false;
			}
			else
			{
				for(int j = 2 ; j<i ;j++)
				{
					if(i%j == 0) 
					{
						isPrime = false;
						break;
					}
					
				}
			}
			if(isPrime) 
			{
				System.out.println(i);
			}
			
		}
	}
}
		



