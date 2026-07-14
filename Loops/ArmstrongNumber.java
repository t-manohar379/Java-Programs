package Loops;
import java.util.Scanner;
public class ArmstrongNumber {
	public static boolean isarmstrong(int n) {
		int count=0;
		int temp1=n;
		int temp=n;
		while(n!=0) {
			n=n/10;
			count++;
		}
		int sum=0;
		while(temp1!=0) {
			int rem=temp1%10;
			sum+=Math.pow(rem,count);
			temp1/=10;
		}
		if(sum==temp)
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n1=sc.nextInt();
		if(isarmstrong(n1))
			System.out.println(n1+" is a Armstrong Number");
		else
			System.out.println(n1+" not is a Armstrong Number");
	}

}
