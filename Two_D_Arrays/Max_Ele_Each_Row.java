package Two_D_Arrays;

public class Max_Ele_Each_Row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{83,11,67},{66,27,33},{24,7,49}};
		
		for(int i=0;i<a.length;i++) {
			int max=0;
			for(int j=0;j<a[i].length;j++) {
				if(max<a[i][j])
					max=a[i][j];
			}
			System.out.println("Maximum element in row "+i+" : "+max);
		}

	}

}
