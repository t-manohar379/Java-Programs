package Patterns;
import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n*2)-1;j++) {
				if(i+j>n && j-i<n) {
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
			
		}

	}

}
