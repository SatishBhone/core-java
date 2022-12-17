package pkg1;

public class ObjectInJava {
  //it is a copy of a class, which is used to load the non-static element of a class.
	//--> it is also called as "instance of class"
	// to Call a static method call by using Class name
	
	int a = 10;    // global variable
	String b = "aae baba ";
	public static void main(String[] args)
	{
		ObjectInJava k = new ObjectInJava();  //Object
		
		System.out.println(k.a);
		System.out.println(k.b);
		ObjectInJava.demoMethod();
		ObjectInJava.demoMethod1();
	}
	
	public static void demoMethod() // Method
	{
		System.out.println("Demo method called");
	}
	
    public static void demoMethod1() 
   {
	System.out.println("hi it's demo method 1");}
   }
