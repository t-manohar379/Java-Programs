package Constructor;
import java.util.Scanner;
public class Employee {
	String name ;
	long ph ;
	String email;
	
	Employee(){
		
	}
	Employee(String name){
		this.name=name;
	}
	Employee(String name,long ph){
		this.name=name;
		this.ph=ph;
	}
	Employee(String name,long ph,String email){
		this.name=name;
		this.ph=ph;
		this.email=email;
	}

}
