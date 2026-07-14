package Arrays;
import java.util.*;
public class RotationInRighrsie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] a= {1 ,2, 3, 4, 5 };
		System.out.print("Enter the no.of rotations :");
		int rotation = sc.nextInt();
		for (int i=0;i<rotation;i++) {
			int temp =a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
			
		}
		System.out.println(Arrays.toString(a));

	}

}
