package pkg1;

public class ConstructorInJava {

	public ConstructorInJava()
	{
		System.out.println("hi this is 1st constructor ");
	}
	
	public static void main(String[] args) 
	{
		//Constructor in java is a special method that is used to initialize objects/variables.
		// the constructor is At the time of constructor declaration below point need to follow :
		
        // Constructor name should be same as class name
		// you should not declare any return type for the constructor (like void).
		// Any no. of Constructor can be declared in a java class but constructor name should be same as 
		// class name, but argument / parameter should be different.
		
		// Use of Constructor 
		// 1. To Copy/load non-static members of class into object -->when we create object of class
		
		//  2. To initialize data member/ variable
		
		// Type of Constructor
		// 1. Default Constructor 
		// 2. User Defined Constructor
		
		new ConstructorInJava();
		
	}

}
