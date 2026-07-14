package Arrays;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(i<j) {
				a[i]=a[i]+a[j];                  // int temp =a[i];
				a[j]=a[i]-a[j];                  // a[i]=a[j];
				a[i]=a[i]-a[j--];			     // a[j--]=temp;
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
