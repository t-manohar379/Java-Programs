package Patterns;

import java.util.Scanner;

public class DiamondAlphabets2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		char ch ='A';
		for (int i=1;i<=n*2-1;i++) {
			for (int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=3*n-1) {
					System.out.print((char)(ch+j-1)  +" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
