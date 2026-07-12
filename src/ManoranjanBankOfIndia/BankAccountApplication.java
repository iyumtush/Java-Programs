package ManoranjanBankOfIndia;

public class BankAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount MBIAccount1 = new BankAccount();
		
		MBIAccount1.account_number = 123;
		MBIAccount1.balance = 1000;
		MBIAccount1.deposit_amount(500);
		MBIAccount1.check_balance(1500);
		MBIAccount1.withdraw_amount(250);
		
	}

}
