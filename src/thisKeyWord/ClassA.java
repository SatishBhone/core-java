package thisKeyWord;

public class ClassA {

	public void show() 
	{
		System.out.println(this);
	}
	
	public static void main(String[] args) 
	{
		ClassA r = new ClassA();
		
		System.out.println(r);
		
		r.show();

	}

}
