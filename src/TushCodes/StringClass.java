package TushCodes;

public class StringClass {

	public static void main(String[] args) {
		String text = "Hello I am Tushar";
		
		System.out.println("Original String : " +text);
		System.out.println("String in Uppercase :" + text.toUpperCase());
		System.out.println("String in Lowercasse :" + text.toLowerCase());
		System.out.println("String Length :" +text.length());
		System.out.println("Character at index 6 :" + text.charAt(6));
		System.out.println("Contains 'Tushar' " + text.contains("Tushar"));
		System.out.println("Starts with 'Hello' " + text.startsWith("Hello"));
		System.out.println("Ends with 'Tushar' " +text.endsWith("Tushar") );
		System.out.println("Index of 'Tushar' " +text.indexOf("Tushar"));
		System.out.println("Last index of 'r' "+ text.lastIndexOf("r"));
		System.out.println("Substring(6) : " +text.substring(6));
		System.out.println("Substring(6,10) : " +text.substring(6,10));
		
		
	String s1 = "Java";
	String s2 = "Python";
		
	System.out.println("Equals : " +s1.equals(s2));
	System.out.println("Equal Ignore case : " + "Java".equalsIgnoreCase("java"));
	System.out.println("Replace : " + text.replace("Java" , "C++"));
	System.out.println(" Is Empty :" +text.isEmpty());
	
	String spaces = "   Java   ";
	System.out.println("Trim : '" + spaces.trim() + "'");
	
	String fruits = "Apple , Mango , Banana";
	String[] arr = fruits.split(",");
	
	System.out.println("Spilt Result :");
	for(String fruit : arr) {
		System.out.println(fruit);
	}
	
	String joined = String.join("-" , "Java" ,"Python" , "C++");
	System.out.println("Join:" + joined);
	
	System.out.println("Repeat :" + "Hi" .repeat(3));
		
		
		
		
		
		
	}
}
