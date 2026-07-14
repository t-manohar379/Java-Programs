package Arrays;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int min= Integer.MAX_VALUE;
		int min2= Integer.MAX_VALUE;
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min2=min;
				min = a[i];
			}
			else if(a[i]<min2 && a[i]!=min) {
				min2 =a[i];
			}
			
		}
		
		System.out.println("Smallest Number is "+min2);

	}

}
