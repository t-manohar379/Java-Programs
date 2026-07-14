package Patterns;
public class NamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 5;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(j==1 || j==5 || i==j && j<=3 || i+j==6 && j>=3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
