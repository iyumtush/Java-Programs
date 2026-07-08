package TushCodes;


public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Not Thread Safe
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append("Programming");
		System.out.println(sb1);
		
		//Thread Safe
		StringBuffer sb2 = new StringBuffer("Java");
		sb2.append("Programming");
		System.out.println(sb2);

	}

}
