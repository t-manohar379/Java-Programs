package String;

import java.util.Scanner;

public class Count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		System.out.print("Enter the Character to get Occurance : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char ch1 =s.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		System.out.println("ch  --> "+count);

	}

}
