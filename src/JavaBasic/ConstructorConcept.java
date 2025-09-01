package JavaBasic;

public class ConstructorConcept {
	// Constructor name should be same as classname
	
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("single parameter constructor");
		System.out.println("the value of i " +i);
	}
	public ConstructorConcept(int i, int j) {
		System.out.println("two parameter constructor");
		System.out.println("the value of i " +i);
		System.out.println("the value of j" + j);
		
	}
	// constructor can overloaded 
	// Agar ham sabhi construtor ko commets kar de aur RUN kare to tab bhi ye error nhi dega kyu ki hidden constructor run kar jayega

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorConcept obj2 = new ConstructorConcept();

	}

}
