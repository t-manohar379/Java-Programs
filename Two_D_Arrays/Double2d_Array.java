package Two_D_Arrays;

import java.util.Scanner;

public class Double2d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows =sc.nextInt();
		System.out.print("Enter the Number of Columns : ");
		int cols =sc.nextInt();
		double [][] a = new double [rows][cols];
		
		System.out.println("Default Elements are : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the Elements are : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextDouble();
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
