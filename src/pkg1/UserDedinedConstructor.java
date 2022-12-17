package pkg1;

public class UserDedinedConstructor {
         int a;    // global variable
         public UserDedinedConstructor() // Zero Argument Constructor
         {
        	 a=10;
        	 System.out.println(a);
         }
	public static void main(String[] args)
	{
		
		UserDedinedConstructor k =	new UserDedinedConstructor();
		System.out.println(k.a);
		
	}

}
