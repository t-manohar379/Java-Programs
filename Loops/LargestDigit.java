package Loops;
import java.util.Scanner;
public class LargestDigit {
	public static int largest(int n) {
		int lar=Integer.MIN_VALUE;
		if(n<0) {
			n=n*-1;
		while(n!=0) {
			int rem=n%10;
			if(lar<rem) {
				lar=rem;
			}
			n/=10;
		}
		}
		return lar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		System.out.println("The largest Digit is "+largest(n));
		

	}

}
