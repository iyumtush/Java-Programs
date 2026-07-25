package DSAinJava;

public class FindPrimeNumbers2 
{

	public static void main(String[] args) 
	{
		int n = 100;
		boolean [] arr = new boolean[n+1];
		sieve(n,arr);
	}
	static void sieve(int num , boolean [] arr) 
	{
	  
		for(int i = 2 ; i * i <= num ;i++) 
		{
			if(!arr[i])
			{
				for(int j = i*2 ; j<= num ; j = j+i)
				{
					arr[j] = true;
				}
			}
		}
		
		
		
		//Space Complexity
		for(int i = 2; i <= num ; i++)
		{
			if(!arr[i])
			{
				System.out.println(i);
			}
		}
	}

}






























