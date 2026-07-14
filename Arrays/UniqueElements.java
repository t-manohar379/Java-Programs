package Arrays;
import java.util.*;
public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int [size];
		for( int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		boolean flag =false;
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				flag=true;
				System.out.print(a[i]+" ");
			}
		}
		if(flag ==false) {
			System.out.println("No unique Elements..............!");
		}
	}

}
