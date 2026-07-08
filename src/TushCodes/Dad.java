package TushCodes;



//Single inheritance
class Dad {
	public void car()
	{
		System.out.println("BMW");
	}
}


public class Child extends Dad {
	
	public static void main(String[] args ) {
		Child tushar = new Child();
		tushar.car();
	}
	
}