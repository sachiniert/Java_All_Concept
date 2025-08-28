package OOpsConcept;

public class MethodOverloding {

	public static void main(String[] args) {
	
		MethodOverloding obj = new MethodOverloding();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	public static void main(int p) {
		
		
	}
	public static void main(int q,int h) {
		
		
	}
	// we can overload  main method also
	// you can not create a method inside a method
	// duplicate methods--i.e same method name with same number of arguments are not allowed
	
	// method overloding --> when the method name is same with different arguments or input parameter within the same class
	public void sum() {// 0 input parameter
		System.out.println("Sum method -- zero param");
	}
	public void sum(double d) {// 0 input parameter
		System.out.println("Sum method -- zero param");
	}
	
	public void sum(int i) {// 1 input parameter
		System.out.println("Sum method--1 input param");
		System.out.println(i);
	}
	
	public void sum(int k, int l) { // 2 input parameter
		System.out.println("Sum method--2 input param");
		System.out.println(k+l);
	}

}
