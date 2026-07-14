package Constructor;

public class DriverBook {
	public static void main(String[] args) {
		Book b1 = new Book("Java",999.9,"james",200);
		Book b2 = new Book ("Python",899.0,"Manohar",199);
		Book b3 = new Book ("Html",799.0,"Mano",299);
		Book b4 = new Book ("Css",699.0,"Hakon",300);
		Book b5 = new Book ("SQL",999.0,"Ronald",299);
		System.out.println("Title : "+b1.title);
		System.out.println("Price : "+b1.price);
		System.out.println("Author : "+b1.author);
		System.out.println("Pages : "+b1.pages);
		System.out.println("========================");
		System.out.println("Title : "+b2.title);
		System.out.println("Price : "+b2.price);
		System.out.println("Author : "+b2.author);
		System.out.println("Pages : "+b2.pages);
		System.out.println("========================");
		System.out.println("Title : "+b3.title);
		System.out.println("Price : "+b3.price);
		System.out.println("Author : "+b3.author);
		System.out.println("Pages : "+b3.pages);
		System.out.println("========================");
		System.out.println("Title : "+b4.title);
		System.out.println("Price : "+b4.price);
		System.out.println("Author : "+b4.author);
		System.out.println("Pages : "+b4.pages);
		System.out.println("========================");
		System.out.println("Title : "+b5.title);
		System.out.println("Price : "+b5.price);
		System.out.println("Author : "+b5.author);
		System.out.println("Pages : "+b5.pages);
		System.out.println("========================");
		
	}

	
}