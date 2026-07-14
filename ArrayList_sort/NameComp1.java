package ArrayList_sort;
import java.util.Comparator;
public class NameComp1 implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o2.name.compareTo(o1.name);
	}
}
