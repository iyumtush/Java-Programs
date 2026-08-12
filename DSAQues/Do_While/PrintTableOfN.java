package Do_While;

import java.util.Scanner;

public class PrintTableOfN 
{
    //To print table of n upto 10
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int n = sc.nextInt();
	  int i = 1;	  
	  do
		{
		    int result = n*i;
		    System.out.print(result+",");
			i++;
		}while(i<=10);
	}

}
