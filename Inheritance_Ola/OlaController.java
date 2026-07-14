package Inheritance_Ola;

public class OlaController {
	
	public static void bookingDetails(Cab cab) {
		System.out.println("*********** Booking Details *************");
		System.out.println("------------------------------------------");
		
	if(cab instanceof Mini) {
		Mini c = (Mini) cab;
		
		System.out.println("Pickup Location : "+c.pl);
		System.out.println("Drop Location : "+c.dl);
		System.out.println("Driver Name : "+c.driver);
		System.out.println("Driver's Phone_no"+c.ph);
		System.out.println("Car No : "+c.carNo);
		System.out.println("Car Model : "+c.model);
		System.out.println("Rating : "+c.rating+"⭐");
		System.out.println("Price : "+c.cost+"Rs/km");
		System.out.println("No of Seats "+c.noOfSeats);
		System.out.println("OTp : "+c.otp);
	}
	else if(cab instanceof Sedan) {
		Sedan c = (Sedan) cab;
		
		System.out.println("Pickup Location : "+c.pl);
		System.out.println("Drop Location : "+c.dl);
		System.out.println("Driver Name : "+c.driver);
		System.out.println("Driver's Phone_no"+c.ph);
		System.out.println("Car No : "+c.carNo);
		System.out.println("Car Model : "+c.model);
		System.out.println("Rating : "+c.rating+"⭐");
		System.out.println("Price : "+c.cost+"Rs/km");
		System.out.println("No of Seats "+c.noOfSeats);
		System.out.println("OTp : "+c.otp);
	}
	else if(cab instanceof Luxuary) {
		Luxuary c = (Luxuary) cab;
		
		System.out.println("Pickup Location : "+c.pl);
		System.out.println("Drop Location : "+c.dl);
		System.out.println("Driver Name : "+c.driver);
		System.out.println("Driver's Phone_no"+c.ph);
		System.out.println("Car No : "+c.carNo);
		System.out.println("Car Model : "+c.model);
		System.out.println("Rating : "+c.rating+"⭐");
		System.out.println("Price : "+c.cost+"Rs/km");
		System.out.println("No of Seats "+c.noOfSeats);
		System.out.println("OTp : "+c.otp);
	}
		
	}

}
