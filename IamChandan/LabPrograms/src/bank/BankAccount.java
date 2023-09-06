package bank;

public class BankAccount {
	String name;
	int accountNo;
	int balance;
	static int interest =12;
	String accountType;
	
	BankAccount(){
		this.name ="Default name";
		this.accountNo =0;
		this.balance =0;
		this.accountType ="Savings";
	}
	
	BankAccount(String name, int accountNo, int balance, String accountType){
		this.name = name;
		this.accountNo = accountNo;
		this.balance= balance;
		this.accountType = accountType;
	}
	
void deposit(int amount) {
	System.out.println("depositing the amount");
	this.balance+= amount;
	System.out.println("amount deposited");
}

void withdrawAmount(int amount) {
		System.out.println("your current balance: "+ this.balance);
		if(this.balance<amount) {
			System.out.println("you are broke");
		return;
		}
		System.out.println("withdrawing amount");
		this.balance-=amount;
}

static void checkInterestRate () {
	System.out.println(interest);
}

void details() {
	System.out.println("name: "+ this.name);
	System.out.println("account number: "+ this.accountNo);
	System.out.println("balance: "+ this.balance);
	System.out.println("account type: "+ this.accountType);
}

}


