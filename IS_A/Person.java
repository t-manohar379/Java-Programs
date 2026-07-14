package IS_A;

public class Person {
	String name ;
	int age;
	String Bg;
	
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this(name);
		this.age = age;
	}
	Person(String name, int age,String Bg){
		this(name,age);
		this.Bg=Bg;
	}
}
