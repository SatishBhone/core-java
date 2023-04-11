package oppsConcept;

public class TestClass {

	public static void main(String[] args) 
	{
		
		SBI_ImplementationClass sbi = new SBI_ImplementationClass();
		
		sbi.AccountOpeningFee();
		sbi.CreditCardJoiningFee();
		sbi.DebitCardJoiningFee();
		sbi.RateofInterest();
	System.out.println("                                        ");
	
		HDFC_ImplementationClass hdfc = new HDFC_ImplementationClass();
		
		hdfc.AccountOpeningFee();
		hdfc.CreditCardJoiningFee();
		hdfc.DebitCardJoiningFee();
		hdfc.RateofInterest();
		
	System.out.println("                                ");
		
		AXIS_ImplementationClass axis = new AXIS_ImplementationClass();
		
		axis.AccountOpeningFee();
		axis.CreditCardJoiningFee();
		axis.DebitCardJoiningFee();
		axis.RateofInterest();
		
		
	}
}
