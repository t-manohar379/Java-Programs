package SingleLevelInheritance;

public class Dog extends Animal{
	String color;
	String breed;
	
	public Dog(String sound,String eating,String color, String breed){
		super(sound,eating);
		this.color = color;
		this.breed = breed;
	}
}

