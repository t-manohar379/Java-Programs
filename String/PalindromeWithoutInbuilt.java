package String;
import java.util.Scanner;
public class PalindromeWithoutInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.next();
		boolean flag =true;
		int j=s.length()-1;
		for(int i=0;i<j/2;i++) {
			if(s.charAt(i)!=s.charAt(j--)) {
				flag = false;
			}
		}
		if(flag==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
			
		

	}

}
