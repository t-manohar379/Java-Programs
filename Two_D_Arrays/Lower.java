package Two_D_Arrays;
import java.util.Scanner;
public class Lower {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [][] a = {{7,5,96},{23,61,19},{49,69,89
			}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i>=j) {
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter the no of columns : ");
		int cols=sc.nextInt();
		int [][] b = new int [rows][cols];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				if(i>=j) {
					System.out.print(b[i][j]+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		
	}
}