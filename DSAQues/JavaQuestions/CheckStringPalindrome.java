package JavaQuestions;

import java.util.Scanner;

public class CheckStringPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(str))
		{
			System.out.println("The String "+str+" is palindrome.");
		}
		else
		{
			System.out.println("The String "+str+" is not palindrome.");
		}
	}

}
