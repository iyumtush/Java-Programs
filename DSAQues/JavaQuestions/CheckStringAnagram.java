package JavaQuestions;

import java.util.Scanner;

public class CheckStringAnagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word : ");
		String w1 = sc.nextLine();
		System.out.print("Enter the Second word : ");
		String w2 = sc.nextLine();
		
		w1 = w1.toLowerCase();
		w2 = w2.toLowerCase();
		
		boolean isAnagram ;
		int count = 0;
		
		if(w1.length() == w2.length())
		{
			isAnagram = true;
			
			for (int i = 0; i < w1.length(); i++) 
			{

                char ch = w1.charAt(i);
                count = 0;

                for (int j = 0; j < w2.length(); j++) 
                {

                    if (ch == w2.charAt(j)) 
                    {
                        count++;
                    }
                }
                if (count == 0) 
                {
                    isAnagram = false;
                    break;
                }
            }			
        } 
		else 
		{
            isAnagram = false;
        }

        if (isAnagram) {
            System.out.println("The words are Anagrams");
        } else {
            System.out.println("The words are NOT Anagrams");
        }

        sc.close();
    }
}