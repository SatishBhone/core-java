package pkg1;

public class StaticMethod {

	public static void main(String[] args) 
	{
		//if we used static keyword in method header is called static Method
		//Static Method is directly called in any method
		//Static Method does not required Object to call
		//Memory allocation at the time of Compilation
	    
		DemoMethod();
	     //Or
	    StaticMethod.DemoMethod();

	}

	public static void DemoMethod() 
	{
		int a= 10;
		System.out.println(""+a);
		System.out.println("incremented by one :"+(++a));
	}
}
