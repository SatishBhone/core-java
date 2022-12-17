package pkg1;

public class ParameterizeConstructor {
        int a;
        String b ;
        
        public ParameterizeConstructor(String h, int c) 
        {
        	a=10;
        	b= h;
        }
	public static void main(String[] args) 
	{
		ParameterizeConstructor k = new ParameterizeConstructor("abc",10);
		
		System.out.println(k.b);
		System.out.println(k.a);
		System.out.println(k.a);
	}
//While creating object we are passing "abc" string as parameter in constructor call,
	// this string value will store in local variable h. then we are assigning value of h to global variable b
}
