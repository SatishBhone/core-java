package encapsulation;

public class UsedOfGetAndSet {

	public static void main(String[] args) 
	{
		User k = new User();
		
		k.setUserName("Satish Bhone");
		k.setUserPassword("Satish@123");
		k.setUserEmail("Satishbhone77@gmail.com");
		k.setUserPhone("7030357457");
		k.setUserCity("Pune");
		
		System.out.println(k.getUserName()+" "+k.getUserPassword()+" "+k.getUserEmail()+" "+k.getUserPhone()+" "+k.getUserCity());
		
		k.setUserName("Gopal Bhone");
		k.setUserPassword("Gopal@143");
		k.setUserEmail("Gopalbhone88@gmail.com");
		k.setUserPhone("7888225184");
		k.setUserCity("Nagpur");
		
		System.out.println(k.getUserName()+" "+k.getUserPassword()+" "+k.getUserEmail()+" "+k.getUserPhone()+" "+k.getUserCity());
		
		User k1 = new User();
		k1.setUserName("Mohan Popalghat");
		k1.setUserPassword("Mohan@123");
		k1.setUserEmail("MohanPopalghat99@gmail.com");
		k1.setUserPhone("8789383994");
		k1.setUserCity("Pune");
		
		System.out.println(k1.getUserName()+" "+k1.getUserPassword()+" "+k1.getUserEmail()+" "+k1.getUserPhone()+" "+k1.getUserCity());
		
	}

}
