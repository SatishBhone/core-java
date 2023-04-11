package exceptionInJava;

public class FinallyBlock {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int k[] = {22,44,55,66,77};
		
		try 
		{
			System.out.println(a/b);
			System.out.println(k[5]);
		}
		finally 
		{
			System.out.println("finally block called");
		}
	     

	}

}
