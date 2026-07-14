package Two_D_Arrays;

public class Identity_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			if(a.length == a[i].length) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					if(a[i][j]==1) {
						flag = true;
					}
				}
				else if(i!=j) {
					if(a[i][j]==0) {
						flag=true;
					}
				}
				
			}
			}
			else {
				System.out.println("Not an Identity matrix ");
			}
		}
		if(flag) {
			System.out.println("Identity Matrix");
		}
		else {
			System.out.println("Not an Identity Matrix");
		}

	}

}
