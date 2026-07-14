package String;

import java.util.Scanner;

public class Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int vowCount = 0;
		int conCount = 0;
		int numCount = 0;
		int speCount=0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
					vowCount++;
				} else {
					conCount++;
				}
			} 
			else if (ch >= '0' && ch <= '9') {
				numCount++;
			}
			else {
				speCount++;
			}

		}
		System.out.println("Vowels Count ="+vowCount);
		System.out.println("Consonants Count ="+conCount);
		System.out.println("Numbers  Count = "+numCount);
		System.out.println("Special Characters count = "+speCount);

	}

}
