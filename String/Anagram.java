package String;
import java.util.*;
public class Anagram {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String 1 : ");
		String s1=sc.nextLine();
		System.out.print("Enter the String 2 : ");
		String s2 = sc.nextLine();
		
		if(s1.length()==s2.length()) {
			if(isanagram(s1,s2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}
	}
	
	public static boolean isanagram(String s1, String s2) {
		char[] c1 = new char[s1.length()];
		char[] c2 = new char[s2.length()];
		
		for(int i=0;i<c1.length;i++) {
			c1[i] = s1.charAt(i);
			c2[i] = s2.charAt(i);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				return false;
			}
		}
		return true;
	
	}
	

}
