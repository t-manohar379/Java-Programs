package Loops;
import java.util.Scanner;
public class AutomorphicNumber {
	public static boolean isautomorphic(int n) {
		int s = n*n;
		int sum1=0;
		int sum2=0;
		while(n!=0) {
			int rem1 = n%10;
			int rem2 = s%10;
			sum1+=rem1;
			sum2+=rem2;
			n/=10;
			s/=10;
		}
		if(sum1==sum2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n1=sc.nextInt();
		if(isautomorphic(n1)) {
			System.out.println(n1+" is a Automorphic Number");
		}
		else {
			System.out.println(n1+" is not a Automorphic Number");
		}
	}

}
