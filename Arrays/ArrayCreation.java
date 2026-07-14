package Arrays;
import java.util.Scanner;
public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println(" ---------Default Values-----:");
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the Array Elements ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
