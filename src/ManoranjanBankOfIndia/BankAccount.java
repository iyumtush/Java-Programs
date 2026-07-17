package ManoranjanBankOfIndia;

public class BankAccount {

	private int account_number;
	
	private double balance;
	
	public BankAccount (int account_number , double Intialbalance) {
		
		this.account_number = account_number;
		this.balance = Intialbalance;
	}
	
	
	public int getAccountNumber() {
		return account_number;
		
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setAccountNumber(int account_number) {
		this.account_number = account_number;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void deposit_amount(double amount){
		
		if(amount>0) {
			
			balance+=amount;
			
			System.out.println("Rs: ₹"+amount+" Deposited ✅ , New Balance Rs: ₹"+balance);
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
	 
	 public void CalInterest() {
		 double interest = 0.05;
		 double interestcredit = getbalance() * interest;
		 deposit_amount(interestcredit);
		 
		 System.out.println("The interset credited :"+interestcredit);
	 }
}
