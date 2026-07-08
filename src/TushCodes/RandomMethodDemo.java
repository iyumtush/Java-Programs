package TushCodes;


import java.util.Random;

public class RandomMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random rnd = new Random();
		
		
		int number;
		
		
		String arr[]= {"Tushar" ,"Mahesh" ,"Dinesh" , "Kartik"};
		
		
	
		number = rnd.nextInt(1,8);
		
		System.out.println(number);

	}

}
