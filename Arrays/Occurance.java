package Arrays;

import java.util.*;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=-1;
						count++;
					}
		}
			if(a[i]!=-1) {
				System.out.println(a[i]+"------->"+count);
			}

	}

}
}
