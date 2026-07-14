package Two_D_Arrays;

public class SumOf_Primary_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{83,11,67},{66,27,33},{24,7,49}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
	System.out.
	println("Sum of Primary Diagonal : "+sum);
	}

}
