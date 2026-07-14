package Arrays;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int [] b = new int[a.length];
		
		for(int i=0 ;i<b.length;i++) {
			b[i]=a[a.length-i-1];
		}
		
		System.out.println(Arrays.toString(b));
	}

}
