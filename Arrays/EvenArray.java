package Arrays;
import java.util.Scanner;
public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size of an Array :");
		int size = sc.nextInt();
		int [] arr = new int [size];
		for( int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		String even="";
		String odd="";
		for( int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i]+" ";
			}
			else {
				odd+=arr[i]+" ";
			}
			
		}
		System.out.println("Even Number are : " +even);
		System.out.println("Odd Number are : " +odd);
	}

}
