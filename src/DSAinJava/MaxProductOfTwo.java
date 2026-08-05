package DSAinJava;

import java.util.Arrays;

public class MaxProductOfTwo 
{

	public static void main(String[] args) 
	{
		int arr[] = {20,5,4,10,111};
	    int maxProduct = arr[0] * arr[1];	
	    
		
	    for(int i = 0 ; i < arr.length - 1 ; i++)
		{
			for( int j = i + 1 ; j < arr.length ; j++)
			{
				int product = arr[i] * arr[j];				
				if(product > maxProduct)
				{
					maxProduct = product;
				}
			}
		}	
		System.out.println(" = " +maxProduct);		
	}
}
