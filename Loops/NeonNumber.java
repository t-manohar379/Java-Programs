package Loops;
import java.util.Scanner;
public class NeonNumber {
	public static boolean isneon(int n1, int m1) {
		
		int sum=0;
		while(m1!=0) {
			int rem=m1%10;
			sum+=rem;
			m1/=10;
		}
		if(n1==sum) {    
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int n= sc.nextInt();
		int m=n*n;
		if(isneon(n,m)) {
			System.out.println(n+" is Neon Number");
		}
		else {
			System.out.println(n+" is not Neon Number");
		}
	}

}
