package JavaQuestions;

import java.util.Scanner;

public class FindNthFibonacciNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		System.out.println("Enter the pos : ");
		int pos = sc.nextInt();
		int firstNum = 0, secondNum = 1;
		int nextNum = 0;
		
		for(int j = 1 ; j <= pos; j++) 
		{
		for(int i = 1 ; i <= num ; i++)
		{
			System.out.print(firstNum+", ");
			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}
		
		}
	}

}
