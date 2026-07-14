package Loops;
import java.util.Scanner;
public class XylemorPhloem {
	public static boolean isxylemorphloem(int n) {
		int exsum=0;
		int n1=n;
		int mnsum=0;
		while(n>9) {
			if(n==n1) {
				exsum+=n%10;
			}
			else {
				mnsum+=n%10;
			}
		n/=10;	
		}
		exsum+=n;
		return exsum==mnsum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		if(isxylemorphloem(n)) {
			System.out.println(n+" is a Xylem Number");
		}
			else {
				System.out.println(n+" is a Phloem Number");
			}
				
	}

}
