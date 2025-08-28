package OOpsConcept;

public class FunctionsInJava {
     // main method --> starting point of execution
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created , obj is the refrence variable , referring to this object
		// after creating the object , the copy of all non static method will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div =obj.division(30,10);
		System.out.println(div);
		
		//obj.division(30,3);
	}
	// non static methods 
	//void -- doea not return only value
	// retrun type = void
	public void test() {// no input , no output
		System.out.println("test method");
	}
	
	public int pqr() { // no input , some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c =a+b;
		return c;
	}
	
	// return type is String
	public String qa() {// no input , some output
		System.out.println("qa method");
		String s ="Selenium";
		return s;	
	}
	
	// return type is int
	// x,y-- input parameter/argument
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
	}

}
