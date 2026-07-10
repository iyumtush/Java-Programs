package TushCodes;

public class StudentTotalMarks2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int std_marks [][]= {{30,50,40,60},{60,50,30,90},{90,50,30}};
		
		
		for(int i = 0 ; i<std_marks.length ;i++) {
			int sum = 0; 
			
			for(int j=0;j<std_marks[i].length ; j++) {
				
				sum +=std_marks[i][j];
				
				
			}
			System.out.println("Total Marks of Student "+i+"="+sum);
			
			
		}
	}

}
