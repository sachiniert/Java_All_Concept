package OOPsConceptPart2;

public class BMW  extends Car{//HAS a relationship


	// when same methods is present in parent class as well as in child class with same name and same number of argumets,
	// is called method overriding 
	
	public void start() { // overridden method
		
		
		System.out.println("BMW--Start");
	}
	public void theftSafety() {
		System.out.println("BMW--theftSafty");
	}
	

}
