package encapsulation;

public class UserHomePage {

	public static void main(String[] args) 
	{
		
		User k = new User(); 
		k.getUserName();      //  Getting name by using getter
		k.setUserName("Satish"); // Setting name by using Setter
		
		User k1 = new User();
		k1.setUserName("Gopal");
		
		String username = k.getUserName();
		System.out.println(username);
		
		// Print 
		
		System.out.println(k.getUserName());
		System.out.println(k1.getUserName());
		
	}

}
