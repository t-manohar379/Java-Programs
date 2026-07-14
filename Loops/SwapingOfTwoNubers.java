package Loops;
import java.util.Scanner;
public class SwapingOfTwoNubers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter the Number2 : ");
		int n2=sc.nextInt();
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		

	}

}
