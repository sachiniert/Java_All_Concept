package OOPsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(USBank.min_bal);
		
	HSBBaank hs = new HSBBaank();
	
	hs.credit();
	hs.debit();
	hs.transferMoney();
	hs.educationloan();
	hs.carLoan();
	
	// dynamic polymorphism
	// child class object can be referred by parent Interface reference var
	
	USBank hb = new HSBBaank();
	hb.credit();
	hb.debit();
	hb.transferMoney();
	

	}

}
