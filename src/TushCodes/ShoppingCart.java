package TushCodes;


import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String itemname;
		int price;
		int quantity;
		
		System.out.println("Enter the item name :");
		itemname = sc.nextLine();
		
		System.out.println("Enter the price of "+itemname+":");
		price = sc.nextInt();
		
		System.out.println("Enter the quantity of "+itemname+":");
		quantity = sc.nextInt();
		
		
		int total = price * quantity ;
		
		System.out.println("You bought "+itemname);
		System.out.println("Quantity are : "+quantity);
		System.out.println("It total cost you :₹" + total);
		System.out.println("Thank You For Purchase...");
		

	}

}
