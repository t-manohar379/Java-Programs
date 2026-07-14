package ArrayList_sort;

import java.util.Comparator;

public class IdComp1 implements Comparator<Student> {
	public int compare(Student o1,Student o2) {
		return o2.id-o1.id;
	}

}
