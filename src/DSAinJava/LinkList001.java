package DSAinJava;
import java.util.*;
public class LinkList001 
{

	public static void main(String[] args) 
	{
	   /*LinkedList<String> fruits = new  LinkedList<String>();
	   fruits.add("Banana");
	   fruits.add("Apple");
	   fruits.add("Orenge");
	   fruits.add("Kiwi");
	   fruits.add("Avocado");
	   System.out.println(fruits);
	   
	   fruits.addFirst("Cherry");
	   System.out.println(fruits);*/
		
		// Q1) reverse a linkedlist
		
		/*LinkedList <Integer> list = new 
				LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		 System.out.println(list);
		 Collections.reverse(list);
		 System.out.println("Output : "+list);*/
		
		//Q2) find the middle element of linkedlist
		/*LinkedList <Integer> list = new 
				LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		int middle = list.size()/2;
		System.out.println("Middle element : "+list.get(middle));*/
		
		// Q3) remove duplicates from linkedlist
		LinkedList <Integer> list = 
				new LinkedList<Integer>(Arrays.asList(
						30,40,40,50,60,50,30,20,30,40,70,40,70,10));
		System.out.println("Input : " +list);
		Set <Integer> set = new LinkedHashSet<Integer>(list);
		
		list.clear();
		list.addAll(set);
		System.out.println("Output : " +list);
	}

}
