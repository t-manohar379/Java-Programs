package Project;

public class Pen {
	String brand ;
	double price ;
	String color ; 
	
	Pen(String brand){
		
		this.brand = brand;
		
	}
	Pen(String brand ,double price){
		this(brand);
		this.price = price;
	}
	Pen(String brand, double price, String color){
		this(brand,price);
		this.color = color;
	}
}
