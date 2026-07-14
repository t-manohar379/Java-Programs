package SET;

public class Car {
	String brand;
	String color;
	double price;
	int mileage;
	
	public Car(String brand, String color, double price,int mileage){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.mileage=mileage;
	}
	
	public String toString() {
		return "[ Brand :"+brand+", Color :"+color+", Price :"+price+", Mileage :"+mileage+" ]";
	}
	
}
