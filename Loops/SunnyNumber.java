package Loops;
import java.util.Scanner;
public class SunnyNumber {
	public static boolean issunny(int n) {
		int m=n+1;
		boolean b=false;
		for(int i=1;i<m/2;i++) {           
			if(i*i==m) {                    //return true
				b=true;
			}
		}                                  //After the for loop +return false
		if(b=true) {
			return true;
		}
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int n= sc.nextInt();
		if(issunny(n)) {
			System.out.println(n+" is a Sunny Number ");
		}
		else {
			System.out.println(n+" is not a Sunny Number ");
		}

	}

}
