package PatternPackage;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the no of rows : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				
				if(i+j>=n+2 && j-i<=n-2 && i-j<=2 && i+j<=n*3-2){
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
