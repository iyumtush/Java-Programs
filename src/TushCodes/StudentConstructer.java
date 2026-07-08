package TushCodes;

public class StudentConstructer {

	StudentConstructer() {
		// TODO Auto-generated method stub
		System.out.println("Hello I'm Student");

	}
	StudentConstructer(String name){
		System.out.println("Hello "+ name );
		
	}
	StudentConstructer(int age) {
		System.out.println("Age : " + age);
		
	}

	public static void main(String[] args) {
		
		StudentConstructer obj1 = new StudentConstructer();
		StudentConstructer obj2 = new StudentConstructer("Tushar");
		StudentConstructer obj3 = new StudentConstructer(18);
	}
}
