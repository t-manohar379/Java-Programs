package Assignments;
import java.util.Scanner;
public class A_z_evenAscii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String even="";
		String odd="";
		String Even="";
		String Odd="";
		for(char i = 'A'; i<='Z';i++) {
			int n = i;
			if(n%2==0) {
				even+=n+" ";
//				
			}
			else {
				odd+=n+" ";
//				
			}
		}
		for(char i = 'a'; i<='z';i++) {
			int n = (int)i;
			if(n%2==0) {
				Even+=n+" ";
			}
			else {
				Odd+=n+" ";
			}
		}
		System.out.println("Even Ascii Values are :"+even);
		System.out.println("Odd Ascii Values are :"+odd);
		System.out.println("Even Ascii Values are :"+Even);
		System.out.println("Odd Ascii Values are :"+Odd);

	}

}
