package Arrays;

import java.util.Scanner;

public class AverageofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] arr = new int [size];
		for( int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for( int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Average of an Array : " + sum/size);
	}

}
