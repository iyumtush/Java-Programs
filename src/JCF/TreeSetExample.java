package JCF;

import java.util.TreeSet;

public class TreeSetExample 
{

	public static void main(String[] args) 
	{
		TreeSet<String> company = new TreeSet<String>();
		company.add("MicroSoft");
		company.add("Netflix");
		company.add("Google");
		company.add("Amazon");
		
		//In TreeSet the elements are sorted and list in Alphabetic order
		//and if there are number so as per ascending order
		
		/* it helps create dictionary , Phone Numbers 
		 * records where order is neccesary
		 */
		System.out.println("List of Companies : ");
		
		for( String job : company) 
		{
			System.out.println(job);
		}
		
		company.remove("Google");
		System.out.println("After removing : ");
		for( String job : company) 
		{
			System.out.println(job);
		}
	}

}
