package Polymorphism;

public class whatsapp {
	public static void status(long ph) {
		System.out.println("Status : "+ph);	
		}
	public static void status(String msg) {
		System.out.println("Status : "+msg);		
	}
	public static void status(String msg,String emoji) {
		System.out.println("Status : "+msg+emoji);	
	}
	public static void status(char c) {
		System.out.println("Status : "+c);	
		
	}
}
