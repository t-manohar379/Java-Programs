package Loops;

import java.util.Scanner;

public class SmallestDigit {

	public static int smallest(int n) {
		int lar=Integer.MAX_VALUE;
		while(n!=0) {
			int rem=n%10;
			if(lar>rem) {
				lar=rem;
			}
			n/=10;
		}
		return lar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		System.out.println("The largest Digit is "+smallest(n));
		

	}

}
