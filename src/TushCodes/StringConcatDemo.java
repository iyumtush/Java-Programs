package TushCodes;

public class StringConcatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Fname =("Tushar");
		String Lname = ("Ingale");
		
		String Cname = "Tushar";
		String Sname = "tushar";
		
		String FullName = Fname + " " + Lname ;
		System.out.println(FullName);
		
		
		String FLname = Fname.concat(" ").concat(Lname);
		System.out.println(FLname);
		System.out.println(FLname.length());
		
		

		String sub = FLname.substring( 0, 6);
		System.out.println(sub);
		
		
	  Boolean r = Fname.equals(FLname.substring(0,6));
	  System.out.println(r);
	  
	  Boolean t = Lname.equals(FullName.subSequence(7, 13));
	  
	  System.out.println(t);
	  
	  Boolean a = Cname.equalsIgnoreCase(Sname);
	  
	  Boolean b = Cname.equals(Sname);
	  
	  System.out.println(a);
	  System.out.println(b);
	  
	}
	

}
