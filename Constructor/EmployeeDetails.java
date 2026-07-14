package Constructor;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("1. Withoutdata \n2. Name \n3. Name & Phone \n4. Name, Phno & Email");
		int choice =sc.nextInt();
		switch(choice) {
		
		case 1 ->{
			Employee e = new Employee();
			System.out.print("Welcome To Google ....🙏🙏🙏");
			
			}
		case 2 ->{
			System.out.print("Enter the Name :");
			String name = sc.next();
			Employee e = new Employee(name);
			System.out.println("Welcome To Google ....🙏🙏🙏");
			System.out.println("-------------------------------------");
			System.out.println("Name :"+e.name);
			
		}
		case 3 ->{
			System.out.print("Enter the Name :");
			String name = sc.next();
			System.out.print("Enter the Phone No. :");
			long ph = sc.nextInt();
			Employee e = new Employee(name,ph);
			System.out.println("Welcome To Google ....🙏🙏🙏");
			System.out.println("-------------------------------------");
			System.out.println("Name :"+e.name);
			System.out.println("Phone_No : "+e.ph);
			
		}
		case 4 ->{
			System.out.print("Enter the Name :");
			String name = sc.next();
			System.out.print("Enter the Phone No. :");
			long ph = sc.nextInt();
			System.out.print("Enter the Email :");
			String email = sc.next();
			Employee e = new Employee(name,ph,email);
			System.out.println("Welcome To Google ....🙏🙏🙏");
			System.out.println("-------------------------------------");
			System.out.println("Name :"+e.name);
			System.out.println("Phone_No : "+e.ph);
			System.out.println("Email :"+e.email);
			System.out.println(Long.MAX_VALUE);
		}
		
		}

	}

}
