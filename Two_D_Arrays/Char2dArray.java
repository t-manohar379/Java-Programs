package Two_D_Arrays;
import java.util.Scanner;
public class Char2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows =sc.nextInt();
		
		System.out.print("Enter the Number of Columns : ");
		int cols =sc.nextInt();
		char [][] a = new char [rows][cols];
																																
					System.out.println("Default Elements are : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the Elementsn0 : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.next().charAt(0);
			}
		}
		
		System.out.println("Array Elements are : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
