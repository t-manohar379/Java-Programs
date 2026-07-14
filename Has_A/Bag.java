package Has_A;

public class Bag {

	String brand;
	String color;
	double price;
	Book b;
	Pen p;
	LapBag l;
	
	Bag()
	{
	}
	Bag(String brand, String color, double price, Book b, Pen p, LapBag l)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.b = b;
		this.p = p;
		this.l = l;
	}
	
}
