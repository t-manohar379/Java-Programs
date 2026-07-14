package String;
import java.util.Scanner;
public class Occurance_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s =  sc.nextLine();
		s = s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		System.out.print("Enter the wordc : ");
		String word =sc.next();
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].equals(word)) {
				count++;
			}
		}
		System.out.println(word+"-->"+count);
	}

}
