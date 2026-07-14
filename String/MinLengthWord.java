package String;

import java.util.Scanner;

public class MinLengthWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		s=s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		String min = str[0];
		for(int i=0;i<str.length;i++) {
			if(min.length() > str[i].length()) {
				min=str[i];
			}
		}
		
		System.out.println("Length length word :"+min);

	}

}
