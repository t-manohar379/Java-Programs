package Loops;
import java.util.Scanner;
public class AsciiValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ASCII VALUES FOR UPPER_CASE :");
		for (char i = 'A';i<='Z';i++) {
			System.out.println(i+"-->"+(int)i);
		}
		
		System.out.println("ASCII VALUES FOR LOWER_CASE :");
		for(char i='a';i<='z';i++) {
		System.out.println(i+"-->"+(int)i);
		}
	}	
}
