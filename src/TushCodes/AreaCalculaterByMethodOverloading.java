package TushCodes;

import java.util.Scanner;

public class AreaCalculaterByMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
			AreaOfShapesCalculator calc = new AreaOfShapesCalculator();
			
			System.out.println("Choose option from following :");
			System.out.println("1.Area of rectangle");
			System.out.println("2.Area of circle");
			System.out.println("3.Area of traignle");
			System.out.println("Enter Your Choice : ");
			
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				
				System.out.println("Enter Length : ");
				double length = sc.nextDouble();
				System.out.println("Enter Width");
			}
	}

}
