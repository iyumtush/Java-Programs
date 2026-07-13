package ManoranjanBankOfIndia;

public class BankAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount MBIAccount1 = new BankAccount(123 , 1000);
		
		System.out.println("Account1 Holders Details 👇");
		
		//MBIAccount1.account_number = 123;
		//MBIAccount1.balance = 1000;
		
		System.out.println("The Account Number is :" +MBIAccount1.getAccountNumber());
		System.out.println("The Account Balance :" +MBIAccount1.getbalance());
		MBIAccount1.deposit_amount(500);
		MBIAccount1.check_balance(1500);
		MBIAccount1.withdraw_amount(250);
		
		System.out.println("  ");
		
		System.out.println("Account2 Holder Details 👇");
		
		BankAccount MBIAccount2 = new BankAccount(124 , 10000);
		//MBIAccount1.account_number = 124;
        //MBIAccount1.balance = 10000;
	    MBIAccount1.deposit_amount(8000);
		MBIAccount1.check_balance(10000);
		MBIAccount1.withdraw_amount(7500);
		
	}

}
