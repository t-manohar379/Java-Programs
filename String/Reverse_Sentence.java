package String;

import java.util.Scanner;

public class Reverse_Sentence {             

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		s=s.trim();
		s=s.replaceAll(" +"," ");
		String [] str = s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++) {
			rev=str[i]+" "+rev;
		}
		System.out.println(rev);
	}

}
