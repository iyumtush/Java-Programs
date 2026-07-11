package TushCodes;

public class StringConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Fname =("Tushar");
		String Lname = ("Ingale");
		
		String Cname = "Tushar";
		String Sname = "tushar";
		
		//Method to join to string or to print two index as one 
		
		String FullName = Fname + " " + Lname ;
		System.out.println(FullName);
		
		///Concat Method to join to string or to print two index as one 
		String FLname = Fname.concat(" ").concat(Lname);
		System.out.println(FLname);
		System.out.println(FLname.length());
		
		
         //In substring it print the string from any character n to character n
		String sub = FLname.substring( 0, 6);
		System.out.println(sub);
		
		
		// equal case if equal print true if not prints falls ,
		
	  Boolean r = Fname.equals(FLname.substring(0,6));
	  System.out.println(r);
	  
	  Boolean t = Lname.equals(FullName.subSequence(7, 13));
	  
	  System.out.println(t);
	  
	  ///  in ignore it ignores and print true
	  Boolean a = Cname.equalsIgnoreCase(Sname);
	  
	  Boolean b = Cname.equals(Sname);
	  
	  System.out.println(a);
	  System.out.println(b);
	  
	  // String Compare check each character and give the character alphabetic index
	  
	 int h = Fname.compareTo(Lname);
	 
	 System.out.println(h);
	 
	 // String Formatting
	 
	 int marks = 65;
	 
     String Sentence = String.format("Student with Name : %s, and Marks : %d", Fname ,marks);
     
     System.out.println(Sentence);
	  
	}
	

}
