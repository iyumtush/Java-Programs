package JavaQuestions;

public class RevString 
{
	public static void main(String[] args) 
	{
		String str = "Avengers";
		String reversedstr = "";
		
		for(int i = str.length() - 1 ; i >= 0; i--) 
		{
			reversedstr += str.charAt(i); //It traverse and save each character reversed
		}
		System.out.println("The reversed string : "+reversedstr);
	}
}
