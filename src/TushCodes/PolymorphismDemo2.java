package TushCodes;


class Women{
	void work() {
		System.out.println("Women is working");
	}
}

class Teacher extends Women{
	void work() {
		System.out.println("Women is teaching");
	}
}










public class PolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Women w = new Women();
		w.work();
		
		Teacher w1 = new Teacher();
		w1.work();

	}

}
