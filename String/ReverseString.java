package String;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.next();
		String rev ="";
		for(int i=0;i<s.length();i++) {
			rev+=s.charAt(s.length()-1-i);
		}
		
		System.out.println(rev);
		
		

	}

}
