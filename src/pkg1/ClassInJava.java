package pkg1;

public class ClassInJava {
   //it is collection of object where we can declare data members (Varialbes), member
	// function (Methods), constructor and code block.
	
	
    	int a;  // Variable
        int b; 
       
       public ClassInJava()    // constructor
       {
    	   a = 18;  
    	   b = 30; 
       }
	public static void main(String[] args) 
	{
		System.out.println("Main method");  // Main method
	}
	{
		System.out.println("Code Bolock");  // code block
	}
}
// Static 

 // -->Static member of a class are declared or invoke in the memory at the time of class loading.
// --> Scope of the Static members are throughout the program execution.
//---> To use the static elements class name is used.
//--> To declare the static element class name is used. 

// Non-Static

// --> Non static elements of the class are declared or invoked in the memory when the object or 
// --> instance of the class is created Scope of the static members are throughout the program execution.
// --> i.e Non static members are declared or invoke at the time of program execution.

//--> Scope of the non- static element or members is throughout the object.
//--> To use the non- static elements object reference is use.
