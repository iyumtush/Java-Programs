package TushCodes;

public class LargestSumOfRow2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row [][] = {{2,3,4},
				        {5,5,6},
				      {1,1,1,1,1,5},
				        {4,1,1,5},
				      {5,0,1,1,10}};
		 

	    int MaxSum = Integer.MIN_VALUE; //it use to store min value to compare with currentSum to find out maxSum
	    int MaxRowIDX = -1;        //it store  -1 index to not overlaped with another index from array then it store maxsum row index      
		
	    for(int i = 0 ; i<row.length;i++) {
			
	    	int currentSum = 0;
			
			for(int j = 0; j<row[i].length;j++) {
				
			currentSum += row[i][j];
					
			}
			
			if(currentSum > MaxSum) { //*this the condtion where the MaxSum is calculated 
			                           //at final it find the Max Sum from the row 
				
				currentSum = MaxSum; // here it store MaxSum Value from Current Sum
				MaxRowIDX = i;  // here it store the maxSum row index
				
			}
				
				
		}
	    System.out.println(" The Row Number Contaning Maximum Sum of Element is :" +MaxRowIDX);
	}
}
			
		
		

	

