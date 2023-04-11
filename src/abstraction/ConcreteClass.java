package abstraction;

public class ConcreteClass extends AbstractClass  {
	
	public ConcreteClass(int a)  // Constructor 
	{
		System.out.println(" hi i am user defined constructor");
	}

	@Override
	public void Method1()
	{
		System.out.println("Abstract Method Completed");
	}

	@Override
	public void Method2() {
		
		System.out.println("Abstract Method Completed");
	}

	public void method3() 
	{
		System.out.println("Hellow implement change ");
	}
	
	public static void main(String[] args)
	{
		ConcreteClass k = new ConcreteClass(1);
		k.method3();
		k.Method1();
		
		new ConcreteClass(3);
	}
	
}
