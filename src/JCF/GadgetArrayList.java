package JCF;

import java.util.*;
public class GadgetArrayList 
{
	public static void main(String[] args) 
	{	
	ArrayList<Gadget> gadgetList = new ArrayList<>();
	
	gadgetList.add(new Gadget("Macbook" , 78000.00));
	gadgetList.add(new Gadget("iPhone 14 PM" , 56000.00));
	gadgetList.add(new Gadget("Apple Earbuds" , 1500.00));
	gadgetList.add(new Gadget("Table Lamp" , 409.00));
	
	System.out.println("List Of Gadgets : ");
	for(Gadget gadget : gadgetList) 
	{
		System.out.println(gadget);
	}
	
	//To print the Gadget or list item as per there index 
	// we use "get"
	Gadget macbook = gadgetList.get(0);
	System.out.println(" ");
	System.out.println("Macbook Info : "+macbook);
	
	//To remove item from ArrayList we use "remove"
	gadgetList.remove(3);
	System.out.println(" ");
	System.out.println("After Removing :");
	for(Gadget gadget : gadgetList) 
	{
		System.out.println(gadget);
	}	
	}	
}
