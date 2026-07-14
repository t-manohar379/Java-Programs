package String;
import java.util.Scanner;
public class Reverse_Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		s=s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		System.out.print("Enter the position : ");
		int pos =sc.nextInt()-1;
		
		for(int i =0;i<str.length;i++) {
			String s1=str[i];
			if(i==pos) {
				String rev="";
				for(int j=s1.length()-1;j>=0;j--) {
					rev+=s1.charAt(j);
				}
				str[i]=rev;
			}
			
			System.out.print(str[i]+" ");
		}
		
	  
	}

}
