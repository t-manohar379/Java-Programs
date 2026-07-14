package ArrayList;
import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<> ();
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(9);
		al.add(11);
		al.add(1);
		al.add(9);
		al.add(11);
		al.add(2);
		al.add(9);
		ArrayList<Integer> al2 =new ArrayList<>();
		System.out.println(al);
//		for(int i :al) {
//			if(! al2.contains(i)) {
//				al2.add(i);
//			}
//		}
//		System.out.println(al2);

		// removing Duplicates by using remove() with in the same list
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					al.remove(j);
					j--;
				}
			}
		}
		System.out.println(al);
	}

}
