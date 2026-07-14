package Abstraction;

import java.util.Scanner;

public class AtmDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	     Atm m=new Sbi(10000.0);
		boolean flag=true;
		while(flag) {
			System.out.println("1.Withdraw \n2.Deposite \n3.CheckBalance \n4.Exit");
			int ch =sc.nextInt();
			switch (ch) {
			case 1 ->{
				System.out.print("Enter the amount to Withdraw :");
				double n1=sc.nextDouble();
				System.out.println("--------------------------------------------");
				m.withDraw(n1);
				System.out.println("--------------------------------------------");
			}
			case 2->{
				System.out.print("Enter the amount to Deposite :");
				double n1=sc.nextDouble();
				System.out.println("--------------------------------------------");
				m.deposite(n1);
				System.out.println("--------------------------------------------");
			}
			case 3->{
				System.out.println("--------------------------------------------");
				m.checkBalance();
				System.out.println("--------------------------------------------");
			}
			case 4->{
				System.out.println("------------Thank you Visit Again--------------------");
				flag=false;
				
				
			}
			}
			
		}

	}

}
