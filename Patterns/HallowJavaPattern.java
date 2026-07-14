package Patterns;
import java.util.Scanner;
public class HallowJavaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1) {
					System.out.print("J ");
				}
				else if(i==n) {
					System.out.print("V ");
				}
				else if(j==1 || j==n) {
					System.out.print("A ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
