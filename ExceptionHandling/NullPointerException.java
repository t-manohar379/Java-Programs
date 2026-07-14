package ExceptionHandling;
public class NullPointerException {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		
		try {
			System.out.println("Try starts");
			String s =null;
			System.out.println(s.charAt(0));
			System.out.println("Try ends");
		}
		catch(Exception e) {
			System.out.println("Catch starts");
			System.out.println("Can't access index cuz String is null");
			System.out.println("Catch ends");
		}
	}

}
