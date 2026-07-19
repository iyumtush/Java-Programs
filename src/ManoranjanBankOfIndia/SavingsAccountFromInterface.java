package ManoranjanBankOfIndia;

public class SavingsAccountFromInterface implements BankAccountInterface{

	
	private double balance;
	
	public SavingsAccountFromInterface( double initialbalance ) {
		
		balance = initialbalance;
	}
	@Override
	public void deposit(double amount) {
		
		if(amount>0){
			balance += amount;
			System.out.println("Amount Deposited : "+amount);
			System.out.println("Account Balance : "+balance); 
		}
		else {
			System.out.println("Invalid input");
		}
	}
		

	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			
			balance -=amount;
			System.out.println("Amount Withdraw From Acoount : "+amount);
			System.out.println("Remaining Balance : "+balance);
			
			} else {
				System.out.println("Invalid input or Insufficient Balance ");
			}
	}

	@Override
	public double getbalance() {
		
		
		return balance;
	}

	
}
