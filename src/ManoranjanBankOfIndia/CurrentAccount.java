package ManoranjanBankOfIndia;

public class CurrentAccount extends BankAccount{

	private double interest_rate;
	
	public CurrentAccount(int account_number , double balance , double interest_rate) {
		
		
		super(account_number , balance);
		this.interest_rate = interest_rate;
			
		
		
	}

	@Override
	public void CalInterest() {
		// TODO Auto-generated method stub
		
		double interest = getbalance() * interest_rate;
		deposit_amount(interest);
		System.out.println("Interest Credit : "+interest);
	
	}
	
}
