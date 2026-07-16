package TushCodes;

public class Person {

	
	
	//Static variable
	
	private static int totalPerson = 0;
	
	//instances
	private String name;
	private int age ;
	
	
	//Constructor
	public  Person(String name ,int age ) {
		
		this.name = name ;
		this.age = age;
		totalPerson++;
		
		
		

	}
	
	//methods to display
	public void showPersonName() {
		
		System.out.println("The name of the person is : " +name);
	}
	
	public void showPersonAge() {
		System.out.println("The age of the person is : "+age);
	}
	
	public static void showTotalPerson() {
		System.out.println("The total person present : "+totalPerson);
	}

	
}
