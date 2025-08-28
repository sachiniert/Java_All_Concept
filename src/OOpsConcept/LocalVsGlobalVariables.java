package OOpsConcept;

public class LocalVsGlobalVariables {
	
	// Global variables -- class variables
	String name = "Tom";
	int age = 25;
	

	public static void main(String[] args) {
		int i = 10; // local variables for main method
		System.out.println(i);
		
		// System.out.println(name);-->its not working creating object then its working
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
       System.out.println(obj.name);
       System.out.println(obj.age);	

	}
	
	public void sum() {
		int i = 20; // local var sum method
		int j = 200;
		int age = 25;
	}

}
