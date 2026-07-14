package ArrayList;

import java.util.ArrayList;

public class RemoveNonPrime {
	public static  boolean isPrime(int a) {
		if(a<2) return false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<> ();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(9);
		al.add(11);
		al.add(1);
		al.add(0);
		al.add(15);
		al.add(17);
		al.add(3);
		for(int i=0;i<al.size();i++) {
			if(! isPrime(al.get(i))) {
				al.remove(i);
				i--;
			}
		}
		System.out.println(al);
	}

}
