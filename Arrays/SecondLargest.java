package Arrays;

import java.util.*;

public class SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int max= 0;
		int max2 = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max2 = max;
				max = a[i];
			}
			else if( max2<a[i] && a[i]!=max) {
				max2 = a[i];
			}
		
		}
		
		System.out.println("Second Largest Number is "+max2);

	}


}
