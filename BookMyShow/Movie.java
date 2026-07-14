package BookMyShow;

public class Movie {
	String title;
	int duration;
	String genre;
	double ticketPrice;
	
	public Movie(String title, int duration, String genre, double ticketPrice) {
		this.title = title;
		this.duration = duration;
		this.genre = genre;
		this.ticketPrice = ticketPrice;
	}
	
	public String toString() {
		return "\n[ Title = "+title+", Duration ="+duration+"mins, Genre ="+genre+"TicketPrice ="+ticketPrice+" ]";
	}

}
