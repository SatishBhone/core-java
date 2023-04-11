package oppsConcept;

public class AXIS_ImplementationClass implements RBIInterface {

	@Override
	public void RateofInterest()
	{
		System.out.println("AXIS RateofInterest is 11 % ");
	}

	@Override
	public void CreditCardJoiningFee() 
	{
		System.out.println("AXIS CreditCard JoiningFee is RS 700");
	}

	@Override
	public void DebitCardJoiningFee() 
	{
			System.out.println("AXIS DebitCard JoiningFee is RS 300");
	}

	@Override
	public void AccountOpeningFee()
	{
		System.out.println("AXIS Bank joiningFee is RS 1500 ");
	}

}
