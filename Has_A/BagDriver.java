package Has_A;
import java.util.Scanner;
public class BagDriver {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		new Bag("AmericanTourist","Black",900.0,new Book("Java","James",500),new Pen("Cello","Blue",20.0),new LapBag("Dell","Grey",1000.0, new Laptop("Asus","Black",58000.0), new Charger("Asus",165)));

		
		
	}
}
