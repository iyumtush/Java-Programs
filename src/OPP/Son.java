package OPP;

public class Son extends Father {
	
	int sonLand = 10;  // inheritance example father(lv1) > son (lv2)
	
	//Level 2
	void code()
	{
		System.out.println("Can do coding");
	}
	
	void drive()
	{
		System.out.println("Can drive vehicle");
	}
	
	public static void main(String[] args) {
		

		Son son = new Son();
		
		son.dance();
		son.swim();
		son.laugh();
		
		
	}

}
