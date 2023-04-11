package encapsulation;

public class User {

	// Shift + alt + s --> Shortcut of get and set method
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userPhone;
	private String userCity;
	
	public String getUserEmail() 
	{
		return userEmail;
	}
	public void setUserEmail(String userEmail) 
	{
		this.userEmail = userEmail;
	}
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	public String getUserPhone() 
	{
		return userPhone;
	}
	public void setUserPhone(String userPhone) 
	{
		this.userPhone = userPhone;
	}
	public String getUserCity()
	{
		return userCity;
	}
	public void setUserCity(String userCity)
	{
		this.userCity = userCity;
	}
	
	public void setUserName(String name) 
	{
		     name = "Mr." + name;
		   this.userName = name ;
	}
	public String getUserName() 
	{
		return userName;	
	}	
}
