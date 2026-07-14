package Loops;
import java.util.Scanner;
public class HappyNumber {
	public static int sumofsquareofdigits(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		while(n!=0) {
			int sum=sumofsquareofdigits(n);
			if(sum==1 || sum==4) {
				System.out.println("Happy Number");
				break;
			}
			else {
				n=sum;
			}
		
		}
	}
}