package JCF;

public class Gadget 
{

	
	 private String name;
	 private double price;
	 
	 //Constructor to initialize the class variables
	 public Gadget(String name , double price) 
	 {
		 this.name = name;
		 this.price = price;
	 }	 

	
	 
	 //getters 
	 public String getname()
	 {
		 return name;
	 }
	 public double getprice()
	 {
		 return price;
	 }
	 
	 //toString() method to print any type of value in String format
	 public String toString()
	 {
		return "Gadget [name is : "+name+" &  price of gadget is : "+price+"]";
	 }
}
