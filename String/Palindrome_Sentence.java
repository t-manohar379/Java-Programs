package String;

import java.util.Scanner;

public class Palindrome_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		String [] str  =s.split(" ");
		int j=str.length-1;
		boolean flag = true;
		for(int i=0;i<j/2;i++) {
			if(!str[i].equals(str[j--])) {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Palindrome......");
		}
		else {
			System.out.println("Not Palindrome.........");
		}

	}

}
