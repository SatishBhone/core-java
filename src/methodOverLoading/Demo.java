package methodOverLoading;

public class Demo extends Test{
	
	public static void main(String[] args)
	{
		Demo d = new Demo();
		
		Test y = new Test();
		
		y.Test1();
		d.Test1();
	}
	
	public void Test1() 
	{
		System.out.println("hi i am demo1 method hellow ");
	}

}
