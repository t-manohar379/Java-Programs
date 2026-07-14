package Loops;
import java.util.Scanner;
public class NpowerM {
	public static void power(int n, int m) {
		int pro=1;
		for (int i=1;i<=m;i++) {
			pro=pro*n;
		}
		System.out.println(n+" power "+m+" is "+pro);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N value : ");
		int n=sc.nextInt();
		System.out.print("Enter the M value : ");
		int m=sc.nextInt();
		power(n,m);
		
	}

}
