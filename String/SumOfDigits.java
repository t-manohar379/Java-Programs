package String;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='0' && ch<='9') {
				sum+=(int)ch-48;
				
			}
		}
		System.out.println("Sum of Digits : "+sum);
	}

}
