package bank;

public class TestingBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myaccount= new BankAccount("Chandan",12038, 0, "Savings");
		myaccount.details();
		myaccount.deposit(25000);
		myaccount.withdrawAmount(26000);
		BankAccount.checkInterestRate();
	}

}
