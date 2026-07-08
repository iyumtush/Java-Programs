package TushCodes;

import java.util.Stack;

public class StackHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String> Website = new Stack <String>();
		
		Website.add("CollegeDocs");
		Website.add("Facebook");
		Website.add("Instagram");
		Website.add("Github");
		
		Website.peek();
		
		
		Website.pop();

		
		System.out.println(Website);
	}

}
