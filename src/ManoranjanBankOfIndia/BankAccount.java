package ManoranjanBankOfIndia;

public class BankAccount {

	int account_number;
	
	double balance;
	
	public BankAccount (int account_number , double Intialbalance) {
		
		this.account_number = account_number;
		this.balance = Intialbalance;
	}
	
	public void deposit_amount(double amount){
		
		if(amount>0) {
			
			balance+=amount;
			
			System.out.println("Amount Rs: ₹"+amount+" Deposited ✅ , New Balance Rs: ₹"+balance);
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
