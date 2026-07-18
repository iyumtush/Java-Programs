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
			System.out.print("Enter Your Choice : ");
			
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				
				System.out.print("Enter Length : ");
				double length = sc.nextDouble();
				System.out.println("Enter Width");
				double width =  sc.nextDouble();
				System.out.print("Area of rectangle :"+ calc.area(length , width));
			break ;
			
				
			case 2 : 
				
				System.out.print("Enter radius : ");
				double radius = sc.nextDouble();
				System.out.println("The area of cirle : "+calc.area(radius));
			break ;
			
			case 3 : 
				
				System.out.print("Enter the base : ");
				double base = sc.nextDouble();
				System.out.print("Enter the height : ");
				double height = sc.nextDouble();
				System.out.println("The area of triangle : " +calc.area(base, height, false));
			break ;
			
			default :
				System.out.println("Invalid choice");
			}
			
			sc.close();
			
	}

}
