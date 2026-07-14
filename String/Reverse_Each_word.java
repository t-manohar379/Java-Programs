package String;
import java.util.Scanner;
public class Reverse_Each_word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s =  sc.nextLine();
		s = s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			String rev="";
			String s1=str[i];
			for(int j=0;j<s1.length();j++) {
				char ch  =s1.charAt(j);
				rev=ch+rev;
			}
			str[i]=rev;
			System.out.print(str[i]+" ");
		}

	}

}
