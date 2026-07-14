package ExceptionHandling;

import java.util.Scanner;

public class InputMismatchException {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter  : ");
			int n = sc.nextInt();
			System.out.println(n);
		}
		catch(Exception e) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Given Wrong input ");
			System.out.print("Reenter the Input : ");
			int n=sc.nextInt();
			System.out.println(n);
			
		}
	}
}
