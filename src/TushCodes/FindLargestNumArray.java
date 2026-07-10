package TushCodes;

public class FindLargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int num[] = {10,40,50,100,150,60,200,22,0,13};
		
		int largest = num[0];
		
		for(int i = 0 ; i<num.length;i++) {
			
			if(num[i]>largest) {
				largest = num[i];
				
				
			}
			
		}
		System.out.println("The Largest Number is : "+largest);

	}

}
