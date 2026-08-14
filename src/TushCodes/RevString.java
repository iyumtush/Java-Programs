package TushCodes;

public class RevString 
{

	public static void main(String[] args) 
	{
		String str = "Tushar";
		String revstr = "";
		
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(rev);
		
		/*for(int i = str.length() - 1; i >= 0; i-- )
		{
			revstr += str.charAt(i);
		}		
		System.out.println(revstr);*/
	}

}
