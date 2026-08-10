package JCF;

import java.util.HashSet;

public class HashSetExample 
{
     //1)HashSet print the list in unordered form *random*
	public static void main(String[] args) 
	{
		HashSet<String> company = new HashSet<>();
		
		company.add("Apple");
		company.add("Infosys");
		company.add("Cisco");
		company.add("ZS");
		company.add("Uber");
		company.add("JusPay");
		company.add("RazerPay");
		company.add("Paypal");
		
		/*2)Added duplicate string but in 
		HashSet it only print unique and once*/
		
		//Therefore "Cisco" will print once in result
		
		company.add("Cisco");
		
		for(String job : company)
		{
			System.out.println(job);
		}
		
		//To find out that particular element in present or not
		System.out.println(company.contains("Apple"));
	}

}
