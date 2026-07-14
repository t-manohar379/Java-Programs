package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
public class List_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("javascript");
		al.add("C#");
		al.add("english");
		al.add("c++");
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext()) {
			String lang=itr.next();
			if(lang.equals("english")) {
				itr.remove();
			}
			else if(itr.nextIndex()==1) {
				itr.add("php");
			}
			else if(lang.equals("javascript")) {
				itr.set("golang");
			}
			
		}
		System.out.println(al);

	}

}
