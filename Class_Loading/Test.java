package Class_Loading;
public class Test {
	static int a=0;
	static {
		System.out.println("Static Bloack");
		}
	static void staticMethod() {
		System.out.println("Static method");
	}
	int b=200;
	Test(){
		System.out.println("Constructor");
	}
	void nonStaticMethod() {
		System.out.println("Non-Static meyhod");
	}
	public static void main(String [] args) {
		System.out.println("Main method");
		Test t= new Test();
		System.out.println(t.b);
		t.nonStaticMethod();
		staticMethod();
	}
	
}
