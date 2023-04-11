package selectionStatement;

public class If_Statement {

	public static void main(String[] args) 
	{
		// Control statement is used to control the flow of code 
		 
	    // these control statement is used to select the particular path depends on condithon
				
        // if condition is true then it will select one path if condition is false it will select Another path
		
		int age = 25;
		                                                          // T---- T = T
		if(age > 22&& age>11 && age<35 && age ==27 ) 
		{
			System.out.println("Condition is True");
		}
		else 
		{
			System.out.println("Condition is False");
		}
		
		
		int age1 = 22;
		
		if(age>=21) 
		{
			System.out.println("you are abel to marry");
		}
		 
// Take values of length and breadth of a rectangle from user and check if it is square or not.
		
		int length = 19;
		int breadth = 10;
		
		if(length==breadth) 
		{
			System.out.println("it is square");
		}
		else 
		{
			System.out.println("it is a rectangle");
		}
	
	//	Take two int values from user and print greatest among them.
		
		int a = 200;
		int b = 300;
		if(a < b) 
		{
			System.out.println("b is greatest");
		}
		else 
		{
			System.out.println("a is greatest");
		}
		
		
		
	}

}
