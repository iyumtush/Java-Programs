package TushCodes;

public class NewCalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewCalculator cal1 = new NewCalculator();
		
		int resultinInt = cal1.add(3, 2);
		System.out.println("Integer Addition : "+resultinInt);
		
		float resultinFloat = cal1.add(5.66f, 6.66f);
		System.out.println("Float Addition : "+resultinFloat);
		
		String resultinString = cal1.add("Hello ", "Tushar !");
		System.out.println("String Concatanation : "+resultinString);
		
	}

}
