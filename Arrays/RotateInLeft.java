package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateInLeft {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] a= {1 ,2, 3, 4, 5 };
		System.out.print("Enter the no.of rotations :");
		int rotation = sc.nextInt();
		for (int i=0;i<rotation;i++) {
			int temp =a[0];
			for(int j=0; j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
