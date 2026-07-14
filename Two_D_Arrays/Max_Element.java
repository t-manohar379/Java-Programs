package Two_D_Arrays;

public class Max_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{83,67,66},{90,30,60},{95,53,65}};
		int max =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
