package JavaQuestions;

import java.util.Scanner;

public class FinbonaciSeries 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int terms = sc.nextInt();
		int firstNum = 0 , secondNum = 1;
		int nextNum;
		
		
		for(int i = 1 ; i <= terms ; i++)			
		{			
			System.out.print(firstNum+ ", ");
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;		
	    }

	}
	
}
