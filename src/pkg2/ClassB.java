package pkg2;

public class ClassB {

	public static void main(String[] args) 
	
	{
		ClassA k = new ClassA();    // it is object of class A
		k.Method1();
		
	}

	
	public String method2() 
	{
		System.out.println("hi this is method 2 from classB");
		return "Pass";
	}
	
	
	public static int method3() 
	{
		System.out.println("hi i am method 3 from classB");
		return 5;
	}
}
