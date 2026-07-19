package ManoranjanBankOfIndia;

public class BankAccountInterfaceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccountFromInterface s_ac1 = new SavingsAccountFromInterface(10000);
		
		s_ac1.deposit(1000);
		s_ac1.getbalance();
		
		System.out.println("  ");
		
		s_ac1.withdraw(1000);
		s_ac1.getbalance();
		

	}

}
