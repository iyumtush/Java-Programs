package TushCodes;


class person  {
	String name;
	
	person(String name) {
		this.name = name ;
		System.out.println("Name : " +name);
	}
		
	}



public class Student extends person {
	
	String course;

	
	Student(String name , String course) {
		super(name);
		this.course = course;
		System.out.println("Course : " + course);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Student obj = new Student("Tushar", "Java");
		
	}

}
