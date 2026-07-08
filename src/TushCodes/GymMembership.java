package TushCodes;


import java.util.Scanner;

public class GymMembership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. month memberships :");
       
    int month = sc.nextInt();
     
     
     if (month == 1) {
    	 System.out.println("₹600");
     }
     else if(month == 2) {
    	 System.out.println("₹1000");
    	 
     }
     else if(month == 3) {
    	 System.out.println("₹1500");
     }
     
     else if (month == 6) {
    	 System.out.println("₹5899");
     }
     else if (month == 12) {
    	 System.out.println("₹10999");
     }
     else if (month == 0) {
    	 System.out.println("Apply nail paint on nails");
     }
     else if(month == -1) {
    	 System.out.println("Invalid input");
     }
     else {
    	 System.out.println("Membership with this combination of months not availible you can contact with owner:(@iyumtush)");
     }
	}

}
