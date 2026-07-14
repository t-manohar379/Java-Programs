package Two_D_Arrays;

public class Identical_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,},{3,4}};
		int [][] b = {{1,2},{3,4}};
		boolean flag = false;
		if(a.length ==b.length && a[0].length == b[0].length) {
		for(int i=0;i<a.length && i<b.length;i++) {
			for(int j=0;i<a[i].length && j<b[i].length;j++) {
				if(a[i][j]==b[i][j]) {
					flag=true;
			}
		}
		}
		
		if(flag=true) {
			System.out.println("Identical");
		}
		else {
			System.out.println("Not Identical");
		}
		}
		else {
			System.out.println("Not Identical.....");
		}

	}

}
