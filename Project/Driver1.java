package Project;
import java.util.Scanner;
public class Driver1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book ("Java",1000.0,"James gosline");
		Book b2 = new Book ("Python",900.0,"Guido");
		
		Pen p1 = new Pen ("Cello",25.0,"Blue");
		Pen p2 = new Pen("Domes",20.0,"Black");
		Pen p3 = new Pen("meow",15.0,"red");
		
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("1. Book \n2. Pen \n3. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 ->{
				boolean check=true;
				while(check) {
					System.out.println("**********BOOKS************");
					System.out.println("1. "+b1.title +"\n2. "+b2.title + "\n3. Exit");
					    ch =sc.nextInt();
					switch(ch) {
					case 1 ->{
						System.out.println("Title   :"+b1.title);
						System.out.println("Price   :"+b1.price);
						System.out.println("Author  :"+b1.author);
					}
					case 2 ->{
						System.out.println("Title   :"+b2.title);
						System.out.println("Price   :"+b2.price);
						System.out.println("Author  :"+b2.author);
					}
					case 3 ->{
						check = false;
					}
					}
				}
			}
            case 2 ->{
            	boolean check=true;
				while(check) {
					System.out.println("**********BOOKS************");
					System.out.println("1. "+p1.brand +"\n2. "+p2.brand + "\n3. "+p3.brand +"\n4. Exit");
					    ch =sc.nextInt();
					switch(ch) {
					case 1 ->{
						System.out.println("Title   :"+p1.brand);
						System.out.println("Price   :"+p1.price);
						System.out.println("Author  :"+p1.color);
					}
					case 2 ->{
						System.out.println("Title   :"+p2.brand);
						System.out.println("Price   :"+p2.price);
						System.out.println("Author  :"+p2.color);
					}
					case 3 ->{
						System.out.println("Title   :"+p2.brand);
						System.out.println("Price   :"+p2.price);
						System.out.println("Author  :"+p2.color);
					}
					case 4 ->{
						check = false;
					}
					}
				}
			}
            case 3 ->{
            	System.out.println("🙏🙏🙏🙏🙏🙏 Thank You Visit Again 🙏🙏🙏🙏🙏🙏");
            	return;
            }
			}
		}
		
	}


}
