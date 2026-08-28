package JavaQuestions;

import java.util.Scanner;

public class CheckStringAnagram 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word : ");
		String w1 = sc.nextLine();
		System.out.println("Enter the Second word : ");
		String w2 = sc.nextLine();
		
		w1 = w1.toLowerCase();
		w2 = w2.toLowerCase();
		
		boolean isAnagram ;
		int count = 0;
		char ch = 0;
		
		if(w1.length() == w2.length())
		{
			isAnagram = true;
			for(int i = 0 ; i< w1.length() ; i++)
			{
				char w1ch = w1.charAt(i);
				
				for(int j = 0 ; j < w2.length(); j++)
				{
					char w2ch = w2.charAt(4);
					
					if(w1ch == w2ch)
					{
					 ch = w1ch;
					}
				}
			}
			
			System.out.println(ch);
			
		}
		else
		{
			isAnagram = false;
		}
		
	}

}
