package Arrays;

import java.util.Scanner;

public class PrimeinArray {
	
	public static boolean isprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
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
		int [] arr = new int [size];
		for( int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1 || arr[i]==0) {
				System.out.println(arr[i]+" is neither prime nor Composite");
			}
			else {
			if(isprime(arr[i])) {
				System.out.println(arr[i]);
			}
			}
		}
		

	}

}
