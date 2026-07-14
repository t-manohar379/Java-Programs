package BookMyShow;
import java.util.ArrayList;
public class Theater {
	String name;
	ArrayList<Movies> movies;
	String location;
	double distance;
	
	public Theater(String name, ArrayList<Movies> movies,String location, double distance ) {
		this.name = name;
		this.movies = movies;
		this.location=location;
		this.distance = distance;
	}
	
}
