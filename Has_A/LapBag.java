package Has_A;

public class LapBag {
	String brand;
	String color;
	double price;
	Laptop l;
	Charger c;
	
	LapBag()
	{
	}
	LapBag(String brand, String color, double price, Laptop l, Charger c)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.l = l;
		this.c = c;
	}
}
