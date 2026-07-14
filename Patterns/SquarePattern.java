package Patterns;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No. of Rows :");
		int rows=sc.nextInt();
		System.out.print("Enter the No. of Columns :");
		int cols=sc.nextInt();
		
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(i==1|| j==1 ) {
					System.out.print("* ");
				}
			}
			System.out.println(); 
		}
		
		

	}

}
