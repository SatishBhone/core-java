package exceptionInJava;

public class RuntimeException {

	public static void main(String[] args) 
	{
		// Run time Exception handle by try and catch block
		// this Exception occur due to invalid logic Or problem in side the logic 
		// 
		int a= 100;
		
		int k[] = {13,34,55,77,99 };
		
		try {
			System.out.println(k[5]);
		} catch (Exception e) 
		{
               System.out.println("last index of array must be length of array -1");
		}
	}

} 
