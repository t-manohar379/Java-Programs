package Assignments;
import java.util.Scanner;
public class PalindromeinRange {
		public static boolean ispalindrome(int n) {
			int temp = n;
			int rev=0;
			while(n!=0) {
				int rem = n%10;
				 rev =rev*10+rem;
				 n/=10;
			}
			if(rev==temp) {
				return true;
			}
			else {
				return false;
			}  
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number to start :");
			int s =sc.nextInt();
			System.out.print("Enter the number to end : ");
			int e = sc.nextInt();
			for (int i=s;i<=e;i++) {
				if(ispalindrome(i)) {
					System.out.print(i+" ");
				}
			}

		}
	
}


