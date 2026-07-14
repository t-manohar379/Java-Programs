package Two_D_Arrays;

public class Sumof_Each_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{83,11,67},{66,27,33},{24,7,49}};
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			System.out.println("Sum of row "+ " "+i+" "+sum);
		}

	}

}
