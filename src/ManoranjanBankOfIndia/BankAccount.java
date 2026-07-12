package ManoranjanBankOfIndia;

public class BankAccount {

	int account_number;
	
	double balance;
	
	
	public void deposit_amount(double amount){
		
		if(amount>0) {
			
			balance+=amount;
			
			System.out.println("Amount Deposited , New Balance Rs: ₹"+balance);
		}
		else {
			System.out.println("Invalid Amount");
		}
		
		
  
		
	}
	
	 public void withdraw_amount(double amount) {
		 if(amount > 0 && amount < balance) {
			 
			 balance-=amount;
			 
			 System.out.println("Amount Withdraw :"+amount+" New Balance Rs: ₹"+balance);
		 }
		 else {
			 System.out.println("Insufficient Balance or Invalid Withdraw Request");
		 }
	 }

	 
	 public void check_balance(double balance) {
		 System.out.println("Your Current Balance Rs: ₹"+balance);
		 
	 }
}
