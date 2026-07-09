package TushCodes;

import java.util.Scanner;

public class TableOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number :");
	
	int table = 0;
	int num = sc.nextInt();
	
	
		
	
  for(int i = 1 ; i<=num; i++){ //iterate the table of i upto num
			
	   System.out.println("Table of "+i);
	
  for(int j= 1; j<=10;j++) {  // gives 10 multiple of i 
		  table = i*j;   
		    
		  System.out.println( +i+"X"+j+"="+table);
	}
		    System.out.println();
		   
	}
		 
sc.close();
}
	
}


