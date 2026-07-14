package String;
import java.util.Scanner;
public class First_Letter_Cap {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine().toLowerCase();
		String [] str =s.split(" ");
		String result ="";
		for(int i=0;i<str.length;i++) {
			String word =str[i];
			String s1="";
			for(int j=0;j<word.length();j++) {
				if(j==0) {
						s1+=(char)(word.charAt(j)-32);
				}
				else {
					s1+=word.charAt(j);
				}
			}
			result+=s1+" ";
			
		}

			System.out.println(result);
		
	}

}
