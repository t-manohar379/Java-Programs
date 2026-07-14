package String;

import java.util.Scanner;

public class CountOfAlphabetAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int numCount=0,alphCount=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a'&&ch<='z') {
				alphCount++;
			}
			else if(ch>='0' && ch<='9') {
				numCount++;
			}
		}
		
		System.out.println("Alphabets Count : "+alphCount);
		System.out.println("Numbers Count : "+numCount);
		
	}

}
