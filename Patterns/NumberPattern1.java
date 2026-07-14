package Patterns;
import java.util.Scanner;
public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		for(char i='A';i<n+'A';i++) {
			for(char j=1;j<=n;j++) {
				if(i+j>=n+'A') {
					System.out.print(i +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
