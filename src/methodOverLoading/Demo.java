package methodOverLoading;

public class Demo extends Test{
	
	public static void main(String[] args)
	{
		Demo d = new Demo();

		d.Test1();
		d.Test1(0);
		d.Test1(0, 0);
	}
	
	public void Test1() 
	{
		System.out.println("hi i am demo1 method hellow ");
	}
	public void Test1(int a) 
	{
		System.out.println(" overloded method ");
	}
	public void Test1(int b, int c) 
	{
		System.out.println(" Method overloaded method2 ");
	}


}
