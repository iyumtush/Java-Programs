package TushCodes;


import java.util.Stack;

public class StackPlatesT8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack <Integer> plate = new Stack<Integer>();
		
		plate.add(1);
		plate.add(2);
		plate.add(3);
		plate.add(4);
		plate.add(5);
		
		plate.peek();  //peek intiate the set the stack
		
		plate.pop(); // pop remove the one layer from stack
		
		plate.pop();
		
		
		
		System.out.println(plate);
		
	}

}
