package oppsConcept;

public class HDFC_ImplementationClass implements RBIInterface{

	@Override
	public void RateofInterest()
	{
		System.out.println("HDFC Rate of Interest is 9 %");
	}

	@Override
	public void CreditCardJoiningFee() 
	{
		System.out.println("HDFC CreditCardbJoiningFee is RS 500");	
	}

	@Override
	public void DebitCardJoiningFee() 
	{
		System.out.println("HDFC DebitCard JoiningFee is Rs 300 ");
		
	}

	@Override
	public void AccountOpeningFee()
	{
		System.out.println("HDFC Account OpeningFee is RS 750 ");
	}
	

}
