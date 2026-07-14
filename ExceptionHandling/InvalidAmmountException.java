package ExceptionHandling;

public class InvalidAmmountException extends RuntimeException{
	public InvalidAmmountException (String msg) {
		super(msg);
	}
}
