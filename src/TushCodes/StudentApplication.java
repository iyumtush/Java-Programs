package TushCodes;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentStaticMTDemo s1 = new StudentStaticMTDemo ("Tushar" , 21);
		StudentStaticMTDemo s2 = new StudentStaticMTDemo ("Manish" , 24);
		
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		
		StudentStaticMTDemo.showTotalStudent();
	}

}
