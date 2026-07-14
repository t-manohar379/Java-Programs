package ObjectClass;

public class Student {
	String name ;
	int id;
	double percentage;
	
	public Student(String name, int id, double percentage) {
		this.name=name;
		this.id=id;
		this.percentage=percentage;
	}
	public String toString() {
		return "My name is "+name+" with the id "+id+"\nI got "+percentage+" Percentage in my academics";
		
	}

}
