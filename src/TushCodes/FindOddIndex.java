package TushCodes;


public class FindOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array [] = {2 ,3,4,9,5,7};
		
		for(int i = 1 ; i < array.length ; i++) {
			
			if(array[i] % 2 != 0) {
				System.out.println("Index " + i + " : " + array[i]);
			}
			
		}

	}

}
