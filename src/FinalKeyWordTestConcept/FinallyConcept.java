package FinalKeyWordTestConcept;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		division();

	}
	
	public static void test1() {
		
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally 
		{
			System.out.println("inside finally block");
		}
	}
	//
	public static void test2() {
		
		try {
			System.out.println("inside test2");
		     }
		finally {
			System.out.println("finally code intest2 method");
		         }
	}
	
	// interview question this
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}
		catch(ArithmeticException e) {
			// if i put NullPointerException place of ArithmeticException it is give error
			
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}finally {
			System.out.println("execute this code een after any exception");
		}
	}

}
