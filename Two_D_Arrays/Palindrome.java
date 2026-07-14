package Two_D_Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,1},
				      {2,3,2},
				      {3,4,3}};
		
		boolean flag = true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length/2;j++) {
				if(a[i][j]!=a[i][a[i].length-j-1]) {
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}

}
