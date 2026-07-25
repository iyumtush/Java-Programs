package DSAinJava;

import java.util.Arrays;

public class Array002 
{
	public static void main(String[] args) 
	{
		int [][] matrix = {{11,12,13,14},
				           {15,16,17,18},
				           {19,20,21,22},
				           {23,24,25,26}};
				           
		System.out.println("Input");	
		print(matrix);
		
		System.out.println("\nTranspose");
		transpose(matrix);	
		print(matrix);
		
		System.out.println("\nReverse");
		reverse(matrix);
        print(matrix);
	}
	
	static void reverse(int [][] matrix) 
	{
		int n = matrix.length;
		for(int i=0;i<n;i++) 
		{
			int start = 0;
			int end = n-1;
			while(start < end) 
			{
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}			
		}
	}
	static void transpose(int [][]matrix) 
	{
		int n = matrix.length;
		for(int i = 0; i < n; i++)
		{
			for(int j=i; j<n;j++) 
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	static void print(int [][] matrix) 
	{
		for(int[] row :matrix) 
		{
			for(int val:row) 
			{
				System.out.print(val +" ");
			}
		      System.out.println();
		      
		}
	}
}















