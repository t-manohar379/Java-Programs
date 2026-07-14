package String;

import java.util.Scanner;

public class Seperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		String str1="";
		String str2="";
		String str3="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				str1+=ch;
			}
			else if (ch>='0' && ch <='9') {
				str2+=ch;
			}
			else {
				str3+=ch;
			}
		}
		System.out.println("Alphabets :"+str1);
		System.out.println("Numbers :"+ str2);
		System.out.println("Special Characters :"+str3);

	}

}
