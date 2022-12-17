package pkg1;

public class Non_StaticMethod {

	public static void main(String[] args)
	{
		// if we not used Static Method in Method header is Non-Static Method
		// to Call a Non-Static Method is we have create an object
		//Memory allocation for Non-Static Method is at the time of Run 
		
		Non_StaticMethod k = new Non_StaticMethod();
		
		k.demoMethod();

	}
          public void demoMethod() 
          {
        	  int a= 10;
        	  System.out.println(a);
          }
}
