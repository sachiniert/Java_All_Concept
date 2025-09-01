package JavaBasic;

public class B extends A {
	
	public B() {
		// call parent class constructor using "super" keyword
		//super(10); super is only execute first statement
		super(20,30);
		System.out.println("child class constructor");
	}
	
	
	public static void main(String args[]) {
		B obj = new B();
	}

}
