package DSAinJava;

import java.util.Stack;


public class Stack001 {

	public static void main(String[] args) 
	{
		Stack <Integer> st= new Stack<Integer>();
		System.out.println("Is our stack empty : " +st.isEmpty());
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
	System.out.println("Our stack data : "+st);
	System.out.println("Our stack data : "+st.peek());
	System.out.println("Deleted element : "+st.pop());
	System.out.println("New Stack data : "+st);
	System.out.println("Is our stack empty : " +st.isEmpty());


	}

}
