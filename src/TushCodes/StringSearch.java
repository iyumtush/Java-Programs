package TushCodes;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Core Java Training , here we will learn Java programing";
		
		////It print where the first the string appear so it prints the index of the stringnstart
		
		int index_of_Java = str1.indexOf("Java");
		
		System.out.println(index_of_Java);
		
		
		//It print where the last the string appear so it prints the index of the stringnstart
		
		int index_of_Last_Java = str1.lastIndexOf("Java");
		
		System.out.println(index_of_Last_Java);
		
	}

}
