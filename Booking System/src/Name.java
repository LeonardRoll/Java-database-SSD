import java.io.Serializable;


public class Name implements Serializable
{
	//Attributes
	private String Title;
	private String First_Name;
	private String Last_Name;
	
	//Get and Set functions
	public String getFirst_Name() {
		return First_Name;
	}
	
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	
	public String getLast_Name() {
		return Last_Name;
	}
	
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public void setTitle(String title){
		Title = title;
	}
	
	//Constructor
	public Name(String title,String first_Name,String last_Name)
	{
		Title = title;
		First_Name = first_Name;
		Last_Name = last_Name;
	}

}
