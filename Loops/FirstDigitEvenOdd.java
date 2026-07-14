package Loops;
import java.util.Scanner;
public class FirstDigitEvenOdd {
	public static boolean isevenorodd(int n) {
		while(n>9) {
			n/=10;
		}
		if(n%2==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		if(isevenorodd(n))
			System.out.println("Even the Number");
		else
			System.out.println("Odd the Number");
			 

	}

}
