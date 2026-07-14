package IS_A;

public class Student extends Person{
	int sid;
	String clg;
	
	Student(String name,int age, String Bg, int sid){
		super(name,age, Bg);
		this.sid = sid;
	}
	
	Student(String name,int age, String Bg, int sid, String clg){
		super(name,age, Bg);
		this.sid = sid;
		this.clg =clg;
	}
	

}
