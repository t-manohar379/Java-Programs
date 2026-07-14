package SET;
import java.util.Comparator;
public class Price implements Comparator<Car> {
	public int compare(Car o1, Car o2) {
		if(o1.price>o2.price) {
			return 1;
		}
		if(o1.price<o2.price) {
			return -1;
		}
		return 0;
	}

}

