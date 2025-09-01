package JavaBasic;

public class C extends A {

	public C() {
		super();
	}

	public C(int i) {
		super(i);
	}

	public C(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		C obj = new C();
		C obj1 = new C(10);
		C obj2 = new C(20, 3);

	}

}
