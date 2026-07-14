package Patterns;

public class ArrowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r =7; 
		int c=10;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if((i==1 && j>8 ) || (i==7 && j>8) || (i+j==5 && j<=3) || (i-j==3 && j<=3) || (i==7 && j>8 )
					|| (i+j==9 && i<=3) || (j-i==1 && i>=5) || (i==3 && j>2 && j<6) || (i==5 && j>2 && j<6) || (i+j==11 && i<=3)
					|| (j-i==3 && i>=5) || (i==4&&j==8)) {
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
 