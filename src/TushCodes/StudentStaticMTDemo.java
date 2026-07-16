package TushCodes;

public class StudentStaticMTDemo {

	//instances
	
	private static int total_student = 0;
	
	private String name;
	private int age;
	
	//Constructer
	
	public StudentStaticMTDemo(String name, int age) {
		
		this.name = name;
		this.age = age;
		total_student++;
		
	}
	
	
	//Method - Display 
	public void displayStudentDetails() {
		
		System.out.println("Student Name : "+name+" Age : "+age);
	}
	
	//Static Method
	public static void showTotalStudent() {
		
		System.out.println("Total Students : "+total_student);
	}
	
	//Static -->belong to class not to object 
}
