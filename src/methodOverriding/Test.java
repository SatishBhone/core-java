package methodOverriding;

public class Test extends Demo{

	public static void main(String[] args) 
	{
		
		Test k = new Test();
		k.Test1();
		k.GetPicture();
		
		
	}
	
	public void Test1() 
	{
		System.out.println("hellow");
	}
	
      public  void GetPicture() 
	{
		System.out.println("get");
	}
	
}
