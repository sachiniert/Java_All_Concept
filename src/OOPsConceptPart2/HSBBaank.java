package OOPsConceptPart2;

public class HSBBaank implements USBank,BrazilBank{
	// we are achieving multiple inheritance
	//Is - a relationship
	//if a class is implementing any Interface , then its mandatory to define/override all the methods of Interface  
    // overriding from USBank
	
	public void credit ()
	{
		System.out.println("hsbc-- debit");
	}	
	
	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc-- transferMpney");
	}
	
	public void educationloan() {
		System.out.println("hsbc--edu loan");
	}
	public void carLoan() {
		System.out.println("hsbc --Car loan");
	}
	
	// brazill bank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}
		
	
}
