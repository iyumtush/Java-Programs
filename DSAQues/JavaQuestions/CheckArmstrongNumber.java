package JavaQuestions;

import java.util.Scanner;

public class CheckArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();		
		int sum = 0 ;
		int ogNum = num;
		
		while(num > 0)
		{
			int digit = num % 10;
			sum += (digit * digit * digit);		
			num = num / 10;
		}
		
		if(sum == ogNum)
		{
			System.out.println("The number "+ogNum+" is Armstrong");
		}
		else
		{
			System.out.println("The number "+ogNum+" is not Armstrong");
		}
	}
}
