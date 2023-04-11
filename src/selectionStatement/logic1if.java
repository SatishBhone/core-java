package selectionStatement;

import java.util.Scanner;

public class logic1if {

	public static void main(String[] args) 
	{
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		
		Scanner sac = new Scanner(System.in);
		System.out.println("Enter your Quantity");
		int quantity =sac.nextInt() ;
		
		if((quantity*100) > 1000)                  // 0.1 *100 * 11
		{
			System.out.println("you get discount of "+( 0.1*quantity*100 +"and your total cost is "+ (quantity*100-(0.1*quantity*100)) ));
		}
		else 
		{
			System.out.println("No discount");
		}
	}

}
