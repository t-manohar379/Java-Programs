package SET;
import java.util.ArrayList;

import java.util.HashSet;
public class Hashset {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(35);
		al.add(5);
		al.add(55);
		al.add(25);
		al.add(45);
		al.add(45);
		al.add(5);
		al.add(65);
		System.out.println(al);
		HashSet<Integer> hl=new HashSet<>();	
		for(int i :al) {
			hl.add(i);  
		}
		System.out.println(hl);
		
	}
}
