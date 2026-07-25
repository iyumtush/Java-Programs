package DSAinJava;
import java.util.*;
public class Array0001 
{

	public static void main(String[] args) 
	{

		int [] array = {1,2,3,4,5,6,7};
		
		System.out.println("Input Array  : "
		+Arrays.toString(array));
		
		int start = 0;
		int end = array.length - 1;
		
		while(start < end) 
		{
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println("Output Array : "
		+Arrays.toString(array));
	}

}



















