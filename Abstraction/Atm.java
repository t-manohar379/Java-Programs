package Abstraction;

public abstract class Atm {
	double balance;
	
	public abstract void withDraw(double wd);
	public abstract void deposite(double dep);
	public abstract void checkBalance();
	
	
	Atm(double balance){
		this.balance = balance;
	}
}
