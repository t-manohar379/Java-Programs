package Inheritance_Ola;




import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("**********Welcome To Ola**********");
		System.out.println("1.Mini \n2. Sedan \n3.Luxuary");
		int ch = sc.nextInt();
		System.out.print("Enter the Pick Location : ");
		String pl =sc.next();
		System.out.println("Enter the Drop Location : ");
		String dl = sc.next();
		
		switch(ch){
		case 1 ->{
			Mini m=new Mini(pl,dl,"Tony Stark",9988776655l,"AP16DX4201","Altos",4.5,8,4,1234);
			OlaController.bookingDetails(m);
		}
		case 2 ->{
			Sedan s = new Sedan(pl,dl,"Steve Roger",9911223344l,"TG29AB4422","Seltos",4.9,12,5,4321);
			OlaController.bookingDetails(s);
		}
		case 3 -> {
			Luxuary l = new Luxuary(pl,dl,"Thor",8899889988l,"AP18CD9999","Innova Crista",4.6,20,7,8314);
			OlaController.bookingDetails(l	);
		}
		}

	}

}
