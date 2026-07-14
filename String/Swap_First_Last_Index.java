package String;

import java.util.*;
public class Swap_First_Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		s=s.trim();
		s=s.replaceAll(" +", " ");
		String [] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
		String temp =str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		System.out.print(str[i]+" ");
		}
		
		
	}

}
