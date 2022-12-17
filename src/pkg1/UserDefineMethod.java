package pkg1;

public class UserDefineMethod {

	public static void main(String[] args) 
	{
		UserDefineMethod.DemoMethod(); // Call method By using class name
		DemoMethod();  // Call Method by using it's name
	}
 
	public static void DemoMethod() // User define Method
 {
	 // public -->is Access Specifier 
	// static is ---> used for Memory Management purpose.
	// void is ----> for Return type.
		System.out.println(" hi i am DemoMethod");
 }
}
