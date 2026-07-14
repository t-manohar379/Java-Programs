package Project;

public class Book {
	String title ;
	double price ;
	String author ;
	
	Book(String title){
		this.title = title;
	}
	Book(String title, double price){
		this(title);
		this.price = price;
	}	
	Book(String title, double price, String author) {
		this(title,price);
		this.author = author;
	}
}
