package String;
import java.util.Scanner;
public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		String [] str=s.split(" ");
		System.out.println("Words count : "+str.length);
	}

}
