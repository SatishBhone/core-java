package pkg2;

public class ClassA {

	public static void main(String[] args)
   {
		ClassB pk= new ClassB();  // to call non-static method we want to create an object. 
		pk.method2();
		
		ClassB.method3();  // call static method by class name.
		
		
 }
    public void Method1() // this is method 
    {
    	System.out.println("Hi i am method 1  from classA ");
    }
     

    
}
