package TushCodes;


import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<String> books = new Stack<String>();
		
		
		//Add Books
		
		books.push("Java");
		books.push("Python");
		books.push("C++");
		
		System.out.println("Book in Stack :" +books);
		
		
		//Top book
		
		System.out.println("Top Book : " + books.peek());
		
		
		
		//Remove books
		System.out.println("Removed Book : " +books.pop());
		System.out.println("Removed Book : " +books.pop());
		
		
		// Remaining books 
		
		System.out.println("Remaining Books" +books);
		
	}

}
