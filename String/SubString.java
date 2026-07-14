package String;
import java.util.Scanner;
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="[";
				for(int k=i;k<=j;k++) {
					res+=s.charAt(k)+" ";
				}
				System.out.println(res+"]");
			}
			System.out.println("----------------------------");
		}
		

	}

}
