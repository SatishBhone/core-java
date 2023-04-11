package oppsConcept;

public class SBI_ImplementationClass  implements  RBIInterface {

	@Override
	public void RateofInterest()
	{
	  System.out.println("SBI rate of intrest is 5 %");
	}

	@Override
	public void CreditCardJoiningFee() 
	{
			System.out.println("SBI CreditCard JoiningFee is 530 Rupees");
	}

	@Override
	public void DebitCardJoiningFee() 
	{
		System.out.println("SBI DebitCard JoiningFee is 200 Rupees");
	}

	@Override
	public void AccountOpeningFee() 
	{
      System.out.println("SBI Account OpeningFee is 1000");
		
	}

// This is implementations Class where all un_implemented methods get complied.
	// it is achieve 100%  implementation 
	
	

}
