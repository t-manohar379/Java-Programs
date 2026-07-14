package Arrays;

import java.util.*;

public class DeleteAnElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter the  position : ");
		int pos = sc.nextInt();
		System.out.print("Enter the element : ");
		int ele =sc.nextInt();
		
		int [] b = new int [a.length+1];
		int j=0;
		
		if(pos >=1 && pos<=b.length) {
			for(int i=0;i<b.length;i++) {
				if(pos-1 ==i) {
					b[i]=ele;
				}
				else {
					b[i]=a[j++];
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		}
		else {
			System.out.println("invalid position;");
		}
		
		
		

	}

}
