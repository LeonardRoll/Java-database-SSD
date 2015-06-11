import java.io.Serializable;


public class Contact implements Serializable {
//Attribute
	private String Home_Phone;
	private String Mobile_Phone;
	private String Email;
	
//Get and Set Functions
	public String getHome_Phone() {
		return Home_Phone;
	}
	public void setHome_Phone(String home_Phone) {
		Home_Phone = home_Phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile_Phone() {
		return Mobile_Phone;
	}
	public void setMobile_Phone(String mobile_Phone) {
		Mobile_Phone = mobile_Phone;
	}

//Constructor
	public Contact(String home_Phone,String mobile_Phone,String email)
	{
		Home_Phone = home_Phone;
		Mobile_Phone = mobile_Phone;
		Email = email;
	}
}
