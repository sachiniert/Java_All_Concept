package OOPsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism -- complie time polymorphism
		BMW b = new BMW();
		b.start();
		b.start();
		b.refuel();
		b.theftSafety();
		b.engine();

		System.out.println("***********************");
		Car  c = new  Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("***************");
		
		// top casting
	  Car c1= new BMW(); // child class object can be referred by parent class reference variable -- dynamic polymorphism -- run time polymorphism
	  c1.start();
	  c1.stop();
	  c1.refuel();
	  
	  // Down casting
	  BMW b1 = (BMW)new Car();// classCastException
	  
	}

}
