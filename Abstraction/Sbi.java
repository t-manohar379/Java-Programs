package Abstraction;

public class Sbi extends Atm {
	Sbi(double a){
		super(a);
	}

	public void withDraw(double balance) {
		if(balance<=super.balance) {
			System.out.println("Transaction Successful");
			super.balance-=balance;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}


	public void deposite(double balance) {
		if(balance>0) {
			System.out.println("Deposite Successfully.......");
			super.balance+=balance;
		}
		else {
			System.out.println("deposite ammount should be greater than zero");
		}
		
	}
	public void checkBalance() {
		System.out.println("Balance : "+super.balance+" Rs");
	}
}
