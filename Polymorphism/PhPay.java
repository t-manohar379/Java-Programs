package Polymorphism;

public class PhPay {
	
	public void sendMoney(long ph) {
		System.out.println("Money sent to "+ph);
	}
	public void sendMoney(String name) {
		System.out.println("Money sent to "+name);
	}
	public void sendMoney(long ph, String upi) {
		System.out.println("Money sent to "+ph+upi);
	}
	
}
