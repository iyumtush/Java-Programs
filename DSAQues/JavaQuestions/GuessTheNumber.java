package JavaQuestions;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		int secretNumber = random.nextInt(100)+1;
		
		System.out.print("Guess The Number Between 1 To 100");
		Scanner sc = new Scanner(System.in);
		int guessNumber = 0;
		
		while(guessNumber != secretNumber)
		{
			System.out.print("\nEnter your guess : ");
			guessNumber = sc.nextInt();
			
			if(secretNumber > guessNumber)
			{
				System.out.print("Guess Higher");
			}
			else if(secretNumber < guessNumber)
			{
				System.out.print("Guess Lower");
			}
			else
			{
				System.out.println("Congratulations 🎉 !!! "+secretNumber+" is the right guess");
			}
		}		
		sc.close();
	}
}
