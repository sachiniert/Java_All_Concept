package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		// array to store similar data type values in a array variable
				// lowest bound/index = 0
				//upper bound /index = n-1(n is size of array)
				// one dimensional array
				
				// disadvantages of array:
				//1. size of fix-- static aarray--To overcome of this problem -- we use Collections--ArrayList,HashTable--use dynamic array
				//2. store only similar data types -- To over come of this problem , we use object array
				
				
				//1 int array
				int i[]= new int[4]; // size of arraye 4
				
				i[0] =10;
				i[1] =20;
				i[2]= 30;
				i[3] = 40;
				
				System.out.println(i[2]);
				System.out.println(i[3]);
			
				System.out.println(i.length); // size/length of array
//				System.out.println(i[4]); Index 4 out of bounds for length 4 " i[4] means 5th value does not exist"

				// print all the values of array : use for loop
				for(int j=0; j<=i.length-1;j++) {
					System.out.println(i[j]);
				}
				
				// 2 double array
				double d[] = new double[3];
				d[0] = 12.33;
				d[1] = 12.44;
				d[2] = 13.55;
				System.out.println(d[2]);
				
				// 3 char array
				char c[] = new char[3];
				c[0] = 'c';
				c[1] = '2';
				c[2] = '5';
				
				// 4 boolean array
				boolean b[]= new boolean[2];
				b[0] = true;
				b[1] = false;
				
				// 5 String Array
				String s[] = new String[3];
				s[0]= "test";
				s[1] = "Hello";
				s[2] = "World";
				System.err.println(s.length);
				System.out.println(s[1]);
				
				//6  Object Array :(object is class)--object array is store different data types values
				
				Object ob[] = new Object[6];
				ob[0] = "tom";
				ob[1] =25;
				ob[2] = 12.33;
				ob[3] ="1/1/1990";
				ob[4] = 'M';
				ob[5] = "London";
				System.out.println(ob[5]);
				System.out.println(ob.length);
				for(int k=0 ; k<=ob.length-1;k++) {
					//System.out.println(ob[k]); // for values print
					//System.out.println(k); // index number
					System.out.println(ob[k]);
				}

	}

}
