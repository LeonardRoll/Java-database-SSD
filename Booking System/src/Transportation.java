import java.io.*;

public class Transportation implements Serializable{

	//Attributes
	private String Type;
	private int Capacity;
	
	//Get and Set Functions
	public String getType(){
		return Type;
	}
	public void setType(String type){
		Type = type;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	//Constructor
	public Transportation(String type,int capacity){
		Type = type;
		Capacity = capacity;
	}
}
