package Abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Lion();
		Animal a2 = new Goat();
		
		a1.sound();
		a1.eat();
		a1.sleep();
		
		a2.sound();
		a2.eat();
		a2.sleep();
		

	}

}
