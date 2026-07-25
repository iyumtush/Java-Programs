package AdvJava;

public class CustomExceptionForOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int num = 17;
			
			validateEvenOrOdd(num);
			System.out.println("Number is even");
		}catch(NumberIsOddException e)
		{
			System.out.println("Exception Catched : "+e.getMessage());
		}
	}
	
	public static void validateEvenOrOdd(int num) throws NumberIsOddException {
		
		if(!(num%2 ==0)) {
			
			throw new NumberIsOddException("The number is odd");
		}
	}

}
