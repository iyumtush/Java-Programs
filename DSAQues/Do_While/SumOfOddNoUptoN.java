package Do_While;

import java.util.Scanner;

public class SumOfOddNoUptoN {


		public static void main(String[] args) {
			int i = 1;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number from which you want sum of odd no. : ");
			int num = sc.nextInt();
			int sum = 0;
			
			do
			{
				if(!(i%2 == 0))
				{
					sum += i;
				}
				i++;
			}while(i<=num);
			
			System.out.println("The sum of odd numbers upto "+num+" is : " +sum);
		}

	}