package Do_While;

public class PrintAllOdd1To100 
{
	public static void main(String[] args) 
	{
		System.out.print("Odd Number from 1 to 100 : ");
		int i = 1;
		do
		{
			if(!(i%2==0))
			{
			if(i==99)
			{
				System.out.print(i+".");
			}else
			{
				System.out.print(i+",");
			}
			}
			i++;
		}while(i<=100);
	}

}
