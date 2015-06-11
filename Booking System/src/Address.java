import java.io.Serializable;


public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	//Attributes
	private String Address_Line_1;
	private String Address_Line_2;
	private String City;
	private String Post_Code;
	
	//Get and Set Functions
	public String getAddress_Line_1() {
		return Address_Line_1;
	}
	public void setAddress_Line_1(String address_Line_1) {
		Address_Line_1 = address_Line_1;
	}
	public String getAddress_Line_2() {
		return Address_Line_2;
	}
	public void setAddress_Line_2(String address_Line_2) {
		Address_Line_2 = address_Line_2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPost_Code() {
		return Post_Code;
	}
	public void setPost_Code(String post_Code) {
		Post_Code = post_Code;
	}
	
	//Constructor
	public Address(String address_Line_1,String address_Line_2,String city,String post_Code)
	{
		Address_Line_1 = address_Line_1;
		Address_Line_2 = address_Line_2;
		City = city;
		Post_Code = post_Code;
	}
}
