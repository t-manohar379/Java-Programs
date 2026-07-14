package Arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Element to be Search :");
		int ele = sc.nextInt();
		boolean flag = false;
		int pos = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=true;
				pos =i+1;
				break;
			}

		}
		
		if(flag) {
			System.out.println("Element Found in position "+pos);
		}
		else {
			System.out.println("Element not Found..........");
		}
	}

}
