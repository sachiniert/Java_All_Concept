package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if(b > a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greater than b");
		}
		
		// differnt type of comparison oprator
		// < >  ,<= , >= ,==,!=
		
		int c = 40;
		 int d = 34;
		 if(c==d) {
			 System.out.println(" c and d are equal");
			 
		 }else {
			 System.out.println("c and d are not equels");
		 }
		 
		 // write a logic to findout hte highest number
		 int a1 = 400;
		 int b1 = 300;
		 int c1 = 200;
		 
		 if(a1>b1 & a1>c1) // false & true = false
		 {
			 System.out.println("a1 is greatest");
		 }else if(b1 > c1) {
			 System.out.println("b1 is greatest");
		 }else {
			 System.out.println("c1 is the greates");
			 System.out.println("c1 is most greatest");
		 }


	}

}
