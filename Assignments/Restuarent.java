package Assignments;
import java.util.Scanner;
public class Restuarent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bill ="";
		double amt=0;
		boolean check=true;
		String dbId="abc@123";
		String dbPass="123@321";
		System.out.print("Enter the User Id : ");
		String id=sc.next();
		sc.nextLine();
		System.out.print("Enter the Password : ");
		String pass=sc.next();
		if(dbId.equals(id) && dbPass.equals(pass)) {
		while(check) {
		System.out.println("----------------Welcome To XYZ Restuarent------------------");
		System.out.println("---------------------------Menu----------------------------");
		System.out.println("01) Starters");
		System.out.println("02) Main Course");
		System.out.println("03) Desserts");
		System.out.println("04) Exit");
		int s= sc.nextInt();
		switch(s) {
		case 01 ->{
			System.out.println("-------Starters---------");
			System.out.println("01) Chiken Bites-------100rs");
			System.out.println("02) Chicken Kabab------150rs");
			System.out.println("03) Chicken Tikka------100rs");
			System.out.println("04) Chicken Lollipop----80rs");
			System.out.println("05) Exit");
			int c1 =sc.nextInt();
			switch(c1) {
			case 01 -> {
				System.out.println("Chiken Bites Ordered Successfully");
				bill+="01) Chiken Bites-------100rs \n";
				amt+=100;
			}
			case 02 -> {
				System.out.println("Chicken Kabab Ordered Successfully");
				bill+="Chicken Kabab------150rs \n";
				amt+=150;
			}
			case 03 -> {
				System.out.println("Chicken Tikka Ordered Successfully");
				bill+="Chicken Tikka------100rs \n";
				amt+=100;
			}
			case 04 -> {
				System.out.println("Chicken Lollipop Ordered Successfully");
				bill+="Chicken Lollipop----80rs \n";
				amt+=80;
			}
			

			
			}
			
			
		}
		case 02 ->{
			System.out.println("------------Main Course-------------------");
			System.out.println("01) Chicken Biriyani----------240rs");
			System.out.println("02) Chicken Dum Biriyani------300rs ");
			System.out.println("03) Chicken 65 Biriyani-------260rs");
			System.out.println("04) Mutton Biriyani-----------350rs");
			System.out.println("05) Mutton Dum Biriyani-------400rs ");
			System.out.println("06) Mutton 65 Biriyani--------450rs");
			System.out.println("07) Exit");
			int c1 =sc.nextInt();
			switch(c1) {
			case 01 -> {
				System.out.println("Chicken Biriyani Ordered Successfully");
				bill+="Chicken Biriyani----------240rs \n";
				amt+=240;
			}
			case 02 -> {
				System.out.println("Chicken Dum Biriyani Ordered Successfully");
				bill+="Chicken Dum Biriyani------300rs \n";
				amt+=300;
			}
			case 03 -> {
				System.out.println("Chicken 65 Biriyani Ordered Successfully");
				bill+="Chicken 65 Biriyani-------260rs \n";
				amt+=260;
			}
			case 04 -> {
				System.out.println("Mutton Biriyani Ordered Successfully");
				bill+="Mutton Biriyani-------350rs \n";
				amt+=350;
			}
			case 05 -> {
				System.out.println("Mutton Dum Biriyani Ordered Successfully");
				bill+="Mutton Dum Biriyani-------400rs \n";
				amt+=400;
			}
			case 06 -> {
				System.out.println("Mutton 65 Biriyani Ordered Successfully");
				bill+="Mutton 65 Biriyani--------450rs";
				amt+=450;
			}
			}
		}
		case 03 -> {
			System.out.println("--------------Desserts------------------");
			System.out.println("01) Red Velvet Cake-------120rs");
			System.out.println("02) BlackForest Cake------100rs ");
			System.out.println("03) Chocolate Lava Cake----80rs");
			System.out.println("04) Hot Chocolate----------90rs");
			System.out.println("05) Chocolate Donut--------70rs ");
			System.out.println("06) Kulfi------------------20rs");
			System.out.print("07 Exit");
			int c1 =sc.nextInt();
			switch(c1) {
			case 01 -> {
				System.out.println("Red Velvet Cake Ordered Successfully");
				bill+="Red Velvet Cake-------120rs \n";
				amt+=120;
			}
			case 02 -> {
				System.out.println("BlackForest Cake Ordered Successfully");
				bill+=" BlackForest Cake------100rs \n";
				amt+=100;
			}
			case 03 -> {
				System.out.println("Chocolate Lava Cake Ordered Successfully");
				bill+=" Chocolate Lava Cake----80rs";
				amt+=80;
			}
			case 04 -> {
				System.out.println("Hot Chocolate Ordered Successfully");
				bill+="Hot Chocolate----------90rs \n";
				amt+=90;
			}
			case 05 -> {
				System.out.println("Chocolate Donut Ordered Successfully");
				bill+="Chocolate Donut--------70rs \n";
				amt+=70;
			}
			case 06 -> {
				System.out.println("Kulfi Ordered Successfully");
				bill+="Kulfi------------------20rs \n";
				amt+=20;
			}
			}
		}
		case 04 -> {
			if(amt>1) {
			System.out.println("------------Bill-------------");
			System.out.println(bill);
		    System.out.println("======================================");
		    System.out.println("CGST                     15% ");
		    System.out.println("======================================");
		    System.out.println("Total                     "+(amt+(amt*0.15)));
		    check =false;
			}
			else {
				check=false;
				
			}
		}
		
		}
		
		}
		}
		else {
			System.out.println("Invalid User Id or Password......");
			
		}


	}
}
