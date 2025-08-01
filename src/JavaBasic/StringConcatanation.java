package JavaBasic;

public class StringConcatanation {

	public static void main(String[] args) {
		 // + - is concataion 
		//println - is used to print on the console with a new line
		//print -- is to used to print on the console
		
		int a = 110;
		int b = 200;
		double c = 12.33;
		double d = 10.33;
		
		// String is a class not a variable
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b); // 310
		System.out.println(x+y); // HelloWorld
		
		System.out.println(a+b+x+y); // 310HelloWorld
		
		System.out.println(x+y+a+b);  // HelloWrold110200
		
		System.out.println(x+y+(a+b));  // HelloWorld310
		
		System.out.println(a+b+x+y+a+x+b+y); //310HelloWorld110Hello200World
		System.out.println(c+d);//22.66
		
		System.out.println(x+y+c+d); //HelloWorld12.3310.33

		System.out.println("the value of a is:" +a);//the value of a is:110
		System.out.println("the value is b is:" +b);
		
		System.out.println("the value is a and b: "+(a+b));
		
		System.out.print("Hello Selenium "); // cursor in same line not go next line
		System.out.println("Hello Testing");
	

	}

}
