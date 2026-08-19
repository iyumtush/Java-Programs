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
		int perfectNum = 0;
		for(int i = 1 ; i<= num ; i++)
		{
			if(num / i == 0 )
			{
				sum =+i;
				sum = num;
				break;
			}
			else
			{
				sum = num;
			}
		}
		
		if(sum == num)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Finshyt");
		}
		
	}

}
