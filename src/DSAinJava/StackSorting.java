//Sort a stack using another temporary stack 
//and temporary variable. 
//Sort the elements of a stack in ascending order 
//Using only stack operations No array , No List....

//input 34 , 3 , 31 , 98 , 92 , 23

package DSAinJava;
import java.util.*;

public class StackSorting 
{
  public static void sortStack(Stack <Integer> st) 
  {
	  Stack<Integer> temp = new Stack<>();
	  
	  while(!st.isEmpty()) 
	  {
		  int current = st.pop();
		  
		  while(!temp.isEmpty() && temp.peek()>current)
		  {
			 st.push(temp.pop()); 
		  }
		  
		  temp.push(current);
	  }
	  while(!temp.isEmpty()) 
	  {
		  st.push(temp.pop());
		  
	  }
  }
	public static void main(String[] args) 
	{
		Stack <Integer> st= new Stack<Integer>();	
		st.push(34);
		st.push(3);
		st.push(31);
		st.push(98);
		st.push(92);
		st.push(23);
	System.out.println("Input : "+st);
	
	sortStack(st);
	
	while(!st.isEmpty()) 
	{
		System.out.println(st.pop());
	}
	  
	}

}
