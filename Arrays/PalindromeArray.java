package Arrays;

import java.util.Scanner;

public class PalindromeArray {
	
	public static boolean ispalindrome(int [] a) {
	   for(int i=0;i<a.length/2;i++) {
		   if(a[i]!=a[a.length-i-1]) {
			   return false;
		   }
	   }
	   return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		if(ispalindrome(a)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
