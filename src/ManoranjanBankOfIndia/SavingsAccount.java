package ManoranjanBankOfIndia;

public class SavingsAccount extends BankAccount {
	
	private double interest_rate;
	
	public SavingsAccount(int account_number , double balance , double interest_rate) {
		
		super(account_number, balance);
		
		this.interest_rate = interest_rate;
		
		
		
		
	}
	
	//method to calculate the interest
	
	public void CalInterest() {
		
		double interest = getbalance() * interest_rate;
	   deposit_amount(interest);
	   System.out.println("Interest Credited : "+interest);
	}

}
