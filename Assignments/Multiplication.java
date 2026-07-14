package Assignments;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number to Start : ");
		int s = sc.nextInt();
		System.out.print("Enter the number to end : ");
		int e = sc.nextInt();
		
		for(int i=s;i<=e;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			
			System.out.println("==========================");
		}
	}
}
