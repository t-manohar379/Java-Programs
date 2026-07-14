package MultiLevelInheritance;
public class Husky extends Dog {
	String eyes;
	
	Husky(String sound,String eating,String color,String eyes){
		super(sound,eating,color);
		this.eyes = eyes;	
	}
}
