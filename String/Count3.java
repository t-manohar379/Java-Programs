package String;

import java.util.Scanner;

public class Count3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int capCount=0;
		int lowCount=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				capCount++;
			}
			else if(ch>='a' && ch<='z') {
				lowCount++;
			}
			
		}
		System.out.println("Capital Letter count : "+capCount);
		System.out.println("Capital Letter count : "+lowCount);
		

	}

}
