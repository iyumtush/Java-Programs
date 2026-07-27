package DSAinJava;

import java.util.*;

public class ArrayInfosys 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int n = sc.nextInt();
		int a[]= new int [n];
		System.out.println("\n Enter the elements of the array : ");	
		for(int i = 0 ; i<n; i++)
		{
			System.out.print("Enter "+(i+1)+" element : ");
			 a[i] = sc.nextInt();		
			
		}
		System.out.print("\n Enter total queries : ");
		int q = sc.nextInt();
		int totalSum  = 0;
		for(int j=1;j<=q;j++)
		{
			System.out.print("\nEnter type of "+j+" query : ");
			int type = sc.nextInt();
			System.out.print("\nEnter Starting Index : ");
			int L = sc.nextInt();
			System.out.print("\nEnter Ending Index : ");
			int R = sc.nextInt();
			
			if(type == 1)//Replace the array from L to r
			{
				for(int i = L ; i<=R;i++)
				{
					a[i]=((i-L+1)*a[L]);
				}
			}else if(type == 2)//Sum of the Index from L to r
			{
				int sum = 0;
				for(int i = L ; i<=R;i++)
				{
					sum +=a[i];
				}
				
				totalSum = totalSum + sum;
			}
		}		
		System.out.println("\nFinal Answer : " +totalSum);
	}

}












