package if_statement;

public class Log2 {

	public static void main(String[] args) {

    //Take input of age of 3 people by user 
    //and determine oldest and youngest among them.
	
		int a = 26;
		int b = 40;
		int c = 10;
		
		if(a>b && a>c) //||(a<b && a<c) 
		{
			System.out.println("A is oldest");
		}
		else 
		{
			System.out.println("A youngest");
		}
		if(b>a && b>c) 
		{
			System.out.println("B is greatest");
		}
		else 
		{
			System.out.println("B is Youngest");
		}
		if(c>a && c>b) 
		{
			System.out.println("C is greatest");
		}
		else 
		{
			System.out.println("C is youngest");
		}
	}

}
