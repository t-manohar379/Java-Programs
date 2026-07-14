package Practise;
import java.util.Scanner;
public class fibancci {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int first =0;
		int next =1;
		
		for(int i=1;i<=n;i++) {
			int temp=first+next;
			first=next;
			next=temp;
			System.out.println(temp);
		}
		
	}

}
