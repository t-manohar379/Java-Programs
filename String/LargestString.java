package String;
import java.util.Scanner;
public class LargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		s=s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		String max ="";
		for(int i=0;i<str.length;i++) {
			if(max.length() < str[i].length()) {
				max=str[i];
			}
		}
		
		System.out.println("Maximum length word :"+max);
	}

}
