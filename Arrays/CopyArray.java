package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] arr1 = new int [size];
		int [] arr2 = new int [arr1.length];
		
		for( int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Main Array : "+ Arrays.toString(arr1));
		
		for(int j=0; j<arr2.length ;j++) {
			arr2[j]=arr1[j];
		}
		System.out.println("Copy Array : "+ Arrays.toString(arr2));
		

	}

}
