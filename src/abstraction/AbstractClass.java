package abstraction;

public abstract class AbstractClass {
  // Abstraction --> "it is a process of hiding the implementation 
  // from end user and showing only the functionality to end user"
	
	// Ex. Fan, break, sending email
	
	abstract public void Method1();
	abstract public void Method2();
	
   private void method3() 
	{
		System.out.println("hi ");
	}
	
	
   public AbstractClass()  // user defined constructor 
   {
	   System.out.println("this is Abstrsct class constructor");
   }
   
}
