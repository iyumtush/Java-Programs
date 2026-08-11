package Do_While;

public class PrintAllEven1to100 
{
	// Program to print all numbers from 1 to 100 using do-while loop
	public static void main(String[] args) 
	{
		int i = 1;
		// Loop from 1 to 100 and print each number
		do {
			System.out.print(i + ",");
			i++;
		} while (i <= 100);
	}

}
