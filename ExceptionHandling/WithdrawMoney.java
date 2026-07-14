package ExceptionHandling;

import java.util.Scanner;

public class WithdrawMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double balance = 10000;
		System.out.print("Enter the ammount to withdraw : ");
		double ammount = sc.nextDouble();
		if(balance>=ammount) {
			System.out.println("Transcation Successfully");
		}
		else {
			try {
				throw new InvalidAmmountException("Insufficient Balance ....Please try again...");
			}
			catch(InvalidAmmountException e){
				System.out.println(e);
				System.out.println("Insufficient balance "+balance);
			}
		}
	}
	

}
