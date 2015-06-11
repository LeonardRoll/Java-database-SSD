import java.io.*;

public class Location implements Serializable{
	//Attributes
	private String Name;
	private String Text_Description; //unsure if it can hold enough characters
	
	//Get and Set Functions
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getText_Description() {
		return Text_Description;
	}
	public void setText_Description(String text_Description) {
		Text_Description = text_Description;
	}
	
	//Constructor
	public Location(String name,String text_Description)
	{
		Name = name;
		Text_Description = text_Description;
	}
	
	public Location(String name)
	{
		Name = name;
	}
}
