package Two_D_Arrays;

public class Sum0f_cols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{83,11,67},{66,27,33},{24,7,49}};
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum+=a[j][i];
			}
			System.out.println("Sum of column "+ " "+i+" :"+ " "+sum);
		}
	}

}
