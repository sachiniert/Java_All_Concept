package FinalKeyWordTestConcept;

public class ParentClass {
	//to prevent inheritance 
	// to prevent method overriding 
	// if mark final void start() or final class ParentClass show error in child class
	public void start() {
		System.out.println("parent--statrt method");
	}

}
