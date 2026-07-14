package String;
import java.util.Scanner;
public class Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z'){
				s1+=(char)(ch+32);	
			}
			else if(ch>='a' && ch<='z'){
				s1+=(char)(ch-32);	
			}
		}
		System.out.println(s1);
	}

}




