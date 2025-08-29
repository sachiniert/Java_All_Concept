package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<String>();
		// add 
		l1.add("test");
		l1.add("qtp");
		l1.add("Selenium");
		l1.add("RPA");
		l1.add("RFT");
		
		// print:
		
		System.out.println("Content of linkedList:" +l1);
		
		//addFirst:
		l1.addFirst("Naveen");
		// addLast:
		l1.addLast("Automation");
		System.out.println("content of linkedList:"+l1);
		
		//get
		System.out.println(l1.get(0));
		
		//set:
		l1.set(0, "Tom");
		System.out.println(l1.get(0));
		
		//remove first and last element
		l1.removeFirst();
		l1.removeLast();
		System.out.println("content o linkedList:"+l1);
		
		l1.remove(2);
		System.out.println("content of linkedList:"+l1);
		
// How to print all the values of LinkedList
		//for loop
		
		System.out.println("using of for loop");
		for(int n=0; n<l1.size();n++) {
			System.out.println(l1.get(n));
		}
		
		//advance for loop
		System.out.println("** using advance for loop");
		for(String str: l1) {
			System.out.println(str);
		}
		
		// iterator
		System.out.println("*******Using iterator");
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("************Using while loop");
		int num = 0;
		while(l1.size()>num) {
			System.out.println(l1.get(num));
			num++;
		}
		
	}

}
