package Assignments;
import java.util.Scanner;
public class sumofNumber {

public static int sum(int n,int e) {
		
		if(n==e) {
			return n;
		}
		else {
			
			return n +sum(n+1,e); 
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number start: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number to End :");
		int num2=sc.nextInt();
		
		System.out.println(sum(num1,num2));
		
	}
}
