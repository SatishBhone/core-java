package exceptionInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CompileTimeException {

	public static void main(String[] args) throws InterruptedException 
	{
		// this is example of compile time exception 
		// Throws key word is used to handle compile time exception
		
		demoMethod();
		
	}
	
	public static void demoMethod() throws InterruptedException 
	{
		for(int i=1; i<10; i++) 
		{
			Thread.sleep(2000);  // it brake the normal flow up to two minute
			
			System.out.println(i);
		}
		
	}
	
	public static void gateData() throws FileNotFoundException 
	{
		 FileInputStream  fis = new FileInputStream("");
	}

}
