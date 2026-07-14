package Patterns;
import java.util.Scanner;
public class Rectangle4321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++) {
			int a=1;
			int b=4;
			
			for (int j=1;j<=n;j++) {
				if(i%2==1) {
				   System.out.print((a++) +" ");	
				}
				else {
					System.out.print((b--)+" ");	
				}
			}
			System.out.println();
		}
		

	}

}
