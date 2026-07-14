package Arrays;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.print("Enterv the element to Search : ");
		int ele = sc.nextInt();
		int sindex=0,eindex=a.length-1;
		while(sindex<=eindex) {
			int mid = (sindex+eindex)/2;
			if(ele == a[mid]) {
				System.out.println("Element found.......!");
				return ;
			}
			else if(ele>a[mid]){
				sindex=mid+1;
			}
			else if(ele<a[mid]) {
				eindex = mid-1;
			}
		}
		System.out.println("element not found ......!");
		

	}

}
