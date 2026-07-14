package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveArrays {

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
		int pos = sc.nextInt()-1;

		int [] b = new int [a.length-1];
		int j=0;
		
		
		if(pos >=1 && pos<=a.length) {
			for(int i=0;i<a.length;i++) {
				if(pos != i) {
					b[j++]=a[i];
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
