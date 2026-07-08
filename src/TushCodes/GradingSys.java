package TushCodes;


import java.util.Scanner;

public class GradingSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter your name :");
		String name = sc.next();
		
		System.out.print("Enter the marks : ");
		int marks = sc.nextInt();
				
	
		
	if(name.isEmpty()) {
			
			System.out.println("Please enter your name !!");
		}
	
	else{ 
		System.out.print("Hi "+name+" !,");
			
		}
	

	if(marks >= 90) {
			
			System.out.println("You got A grade 🎉");
		}
		else if (75 <= marks && marks <= 89)  {
			System.out.println("You got B grade 🙌🏻");
			
		}
		
		else if (50 <= marks && marks <= 74) {
			System.out.println("You got C grade 🙁");
			
		}
		else if (50 >= marks) {
			System.out.println("Fail 🤮");
			
		}
		else {
			System.out.println("Wrong input✍️");
			
			
		}

	 sc.close();

	}

}
