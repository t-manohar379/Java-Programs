package Loops;
import java.util.*;
public class GCD {
	public static int gcd(int n, int m) {
		int c=Integer.MIN_VALUE;
		for (int i=2;i<=Math.max(n,m);i++) {
			if(n%i==0 && m%i==0) {
				if(c<i) {
					c=i;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Number 1 : ");
		int n=sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		int m=sc.nextInt();
		System.out.println( gcd(n,m));
		

	}

}
