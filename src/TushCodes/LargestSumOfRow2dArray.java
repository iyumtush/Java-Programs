package TushCodes;

public class LargestSumOfRow2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row [][] = {{2,3,4},{5,5,6},{1,1,1,1,1,5},{4,1,1,5},{5,0,1,1,10}};
		 

	    int MaxSum = Integer.MIN_VALUE;
	    int MaxRowIDX = -1;
		
	    for(int i = 0 ; i<row.length;i++) {
			
	    	int currentSum = 0;
			
			for(int j = 0; j<row[i].length;j++) {
				
			currentSum += row[i][j];
				
			
				
					
			}
			
			if(currentSum > MaxSum) {
				
				currentSum = MaxSum;
				MaxRowIDX = i;
				
				
			}
				
				
		}
	    System.out.println(" The Row Index Contaning Maximum Sum of Element is :" +MaxRowIDX);
	}
}
			
		
		

	

