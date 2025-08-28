package OOpsConcept;

public class StaticAndNonStaticConcept {
	
	// gloobal vars : the scope of global vars will be available across all the functions with same condition 
	String name = "Tom"; // non static global variable
	static int age =25; // static global variable
	
	public static void main(String[] args) {
		// how to  call static methods and vars ?
		// 1 . direct calling
		
		sum();
		// 2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
        // how to call non static methods and vars:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static methods by using object reference ? yes
		obj.sum();// warning will be given
		
	}
	public void sendMail() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("Sum method");
	}

}
