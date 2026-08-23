package JavaQuestions;

import java.util.Scanner;

public class CheckPalindromNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		String str = String.valueOf(num);
		String revstr = new StringBuilder(str).reverse().toString();

			if(str.equalsIgnoreCase(revstr))
			{
				System.out.println("The number "+num+" is palindrome");
			} else
			{
				System.out.println("The number "+num+" is not palindrome");
			}
	}		
	
}



