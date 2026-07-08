package TushCodes;


import java.util.Scanner;

public class InputOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Enter Your Name : ");
		Scanner scanner = new Scanner(System.in);

		
		String name = scanner.nextLine();
		
		
		System.out.print("Enter Your Age : ");
		
	
		
		int age = scanner.nextInt();
	
		
		scanner.close();
		
		System.out.println("Hello " +name +"!");
		
		System.out.println("Your age is : " +age);
		
		if(age > 18) {
			System.out.print(name+ " you are adult");
		}
		else if(age < 18 ) {
			System.out.print(name + " you are teen");
		}
		else {
			System.out.println("Your enter wrong input");
		}
	}
}
