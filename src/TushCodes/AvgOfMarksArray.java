package TushCodes;

public class AvgOfMarksArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = new int[5];
		
		marks[0]=40;
		marks[1]=70;
		marks[2]=60;
		marks[3]=55;
		marks[4]=89;
		
		int sum = 0;
		
		for(int i = 0; i<marks.length;i++) {
			sum += marks[i];
			
		}
		
		float avg;
		
		avg = (sum/marks.length);
		
		System.out.println("The Average Marks :" +avg);

	}

}


