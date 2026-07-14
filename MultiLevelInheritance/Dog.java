package MultiLevelInheritance;
	public class Dog extends Animal{
		String color;
		
		 Dog(String sound,String eating,String color){
			super(sound,eating);
			this.color = color;	
		}
}
