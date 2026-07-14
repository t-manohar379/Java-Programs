package Patterns;
import java.util.Scanner;
public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		char c= 'A';
		for(int i=1;i<=n;i++) {		
			for(int j=1;j<=i;j++) {
				if(c>'Z') {
					c='A';
				}
				System.out.print((char)c++ + " ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
