package String;
import java.util.Scanner;
public class Occurance {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s =  sc.nextLine();
		s = s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					str[j]=null;
					count++;
				}
			}
				System.out.println(str[i]+"--->"+count);
			}
			}
	}
}
