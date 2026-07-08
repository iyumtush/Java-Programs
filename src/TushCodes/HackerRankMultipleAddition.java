package TushCodes;


import java.util.Scanner;

public class HackerRankMultipleAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int num =  sc.nextInt();
		
		int sum = 0 ;
	
		
		
			
		for(int i = 1; i < num ; i++){
			if( i % 3 == 0 || i % 5 == 0) {
				sum += i ;
			}
		}
		 
		 if(sum >= 1) {
			 System.out.println(sum);
		 }
		}
		

	}


