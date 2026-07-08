package TushCodes;

public class LoopContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=10;i++) {
			
			if(i==5)
				continue; //it print all value except when i = 5 , 
			               //it skips the value and continue to print 
			else
			System.out.println(i);
		}
	}

}
