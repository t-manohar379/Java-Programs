package SET;
import java.util.TreeSet;
public class ShowRoom {
	public static void main(String[] args) {
		TreeSet<Car> ts=new TreeSet<>();
		ts.add(new Car("Seltos","Black",1500000,10));
		ts.add(new Car("Creta","PrealBlack",1400000,12));
		ts.add(new Car("Harier","white",2500000,13));
		ts.add(new Car("jeep(Compas)","Black",2600000,15));
		ts.add(new Car("thar","Black",2200000,14));
		ts.add(new Car("Bmw","white",6000000,8));
		ts.add(new Car("Benz","meroon",5500000,9));
		ts.add(new Car("Verna","Black",2000000,13));
		System.out.println(ts);
		for(Car i :ts) {
			System.out.println(i);
		}
	}

}
