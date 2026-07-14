package Bank;

public class BankDriver {
	
	public static void main(String[] args) {
		boolean check=true;
		while(check) {
			System.out.println("1. Register \n2. Login \n3 .Exit");
			int ch=BankController.sc.nextInt();
			switch(ch) {
			case 1->{
				BankController.doRegister();
			}
			case 2->{
				if(BankController.isLoginSuccess()) {
					System.out.println("*Welcome To ICIC Bank");
					boolean op=true;
					while(op) {
						System.out.println("1.Open Account \n2.Check Balance \n3. Passbook \n4. Withdraw \n5 .Deposit \n6. Change pin \n7. Logout");
						ch=BankController.sc.nextInt();
						switch(ch) {
						case 1->{
							BankController.openAccount();
						}
						case 2->{
							BankController.checkBalance();
						}
						case 3->{
							BankController.passBook();
						}
						case 4->{
							BankController.withdraw();
						}
						case 5->{
							BankController.deposit();
						}
						case 6->{
							BankController.changePin();
						}
						case 7->{
							System.out.println("Logout Successful.........😁😁");
							op=false;
						}
						}
					}
				}else 
					System.out.println("Login Failed.....");
			}
			case 3->{
				System.out.println("Thank you visit again....");
				check=false;
			}			
			}
		}
	}
}

