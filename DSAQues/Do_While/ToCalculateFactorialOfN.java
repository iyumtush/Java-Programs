package Do_While;

import java.util.Scanner;

public class ToCalculateFactorialOfN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of which you want factorial : ");
		int num = sc.nextInt();
		int i = num;
		int factorial = 1;
		
		do
		{
			factorial *= i;
			i--;		
		}while(i>=1);		
		
		System.out.println("The factorial of "+num+" is : " +factorial);
	}
}
