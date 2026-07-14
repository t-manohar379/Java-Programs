package String;
import java.util.Scanner;
public class Occurance_Every_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
			}
				System.out.println(s.charAt(i)+"--->"+count);
		}

	}

}