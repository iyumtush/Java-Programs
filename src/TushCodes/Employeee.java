package TushCodes;


class Employeee {
	
	void work() {
		System.out.println(" I am Employee at XYZ company ");
	}

	class Developer extends Employeee {
		
		void work() {
			
		
		
		System.out.println(" I work as a Softhware Devloper ");
		}
		
		
		
	}
	
	public class  //Class not saved 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employeee w = new Employeee();
		
		w.work();
		
		Developer w1 = new Developer();
		
		w1.work();
		
	}

}
