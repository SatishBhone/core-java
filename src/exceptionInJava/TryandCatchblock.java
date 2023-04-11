package exceptionInJava;

public class TryandCatchblock {

	public static void main(String[] args) 
	{
		int a = 100;
		int b = 0;
		int k[] = {22,44,55,66,77};
		
		// we are able to write multiple catch block for one try block
		//when exception is occurred at any line from that line further code will not execute 
		// it will show exception in console 
		try {
			
			try
			{
				
			}
			catch(Exception e)
			{
				try {}
				
				catch(Exception ee) 
				{
					
				}
			}
			
			
			System.out.println(a/b);   //	ArithmeticException
			
			System.out.println(k[5]);  //	ArrayIndexOutOfBoundsException
			
		} catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("last index of arry is length -1 ");
		}
	     catch(ArithmeticException e) 
		{
	    	 System.out.println("Does not divide by Zero");
		}
		
	}
//	ArrayIndexOutOfBoundsException
 //	ArithmeticException
}
