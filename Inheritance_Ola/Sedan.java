package Inheritance_Ola;

public class Sedan extends Cab {
	String driver;
	long ph;
	String carNo;
	String model;
	double rating;
	double cost;
	int noOfSeats;
	int otp;
	public Sedan(String pl,String dl,String driver, long ph, String carNo, String model, double rating, double cost, int noOfSeats,
			int otp) {
		super(pl,dl);
		this.driver = driver;
		this.ph = ph;
		this.carNo = carNo;
		this.model = model;
		this.rating = rating;
		this.cost = cost;
		this.noOfSeats = noOfSeats;
		this.otp = otp;
	}
	
}
