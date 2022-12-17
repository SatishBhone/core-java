package pkg1;

public class Constructor1 {
// we can get different value of global variable b, when we pass different 
// variable with creation of different object  	
	
	int a;      // Global Variable 
	String b;
	public Constructor1(String c) // parameterize constructor 
	{
		a = 20;
		b = c;
	}
	
	public static void main(String[] args)  // Main method
	{
		Constructor1 k1 = new Constructor1("Satish");  //Object of a Class
		System.out.println(k1.b);
		Constructor1 k2 = new Constructor1("Bhone");
        System.out.println(k2.b);
	
	}

}
