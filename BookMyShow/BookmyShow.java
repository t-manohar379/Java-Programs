package BookMyShow;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class BookmyShow {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Movie> movies=new ArrayList<>();
		movies.add(new Movie("Khaleja",140,"Fiction",300));
		movies.add(new Movie("Athadu",166,"Action",250));
		movies.add(new Movie("Avenger Endgame",180,"Sci-fi",350));
		movies.add(new Movie("Dukudu",155,"Action,Comedy",200));
		movies.add(new Movie("Businessman",160,"Action",380));
		movies.add(new Movie("Conjuring",150,"horror",180));
		movies.add(new Movie("Jathiratnalu",180,"comedy",300));
		movies.add(new Movie("Pokiri",185,"Thriller",320));
		movies.add(new Movie("kantara",182,"Fictional",330));
		movies.add(new Movie("MissionImpossible",156,"Adventer",150));
		
		ArrayList<Theater> theater = new ArrayList<>();
		Theater.add(new Theater("AMB Cinemas,");
		
		
	}

}
