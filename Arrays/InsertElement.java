package Arrays;

import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
	    
		System.out.print("Enter the index to insert an Element : ");
		int index = sc.nextInt();
		System.out.print("Enter the Element to insert : ");
		int e = sc.nextInt();
		
		for(int i=0;i<a.length;i++){
			if(index==i) {
				a[i]=e;
				break;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
