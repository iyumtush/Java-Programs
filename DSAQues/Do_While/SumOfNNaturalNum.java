package Do_While;
import java.util.Scanner;

public class SumOfNNaturalNum 
{  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter the number till which you want the sum : ");
		int num = sc.nextInt();	
		int sum = 0;
		
		do
		{
			sum += i;
			i++;
		}while(i<=num);
		
		System.out.print("The sum of the natural numbers upto "+num+": "+sum);
	}
}
