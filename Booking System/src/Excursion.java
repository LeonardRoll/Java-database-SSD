import java.io.*;

public class Excursion implements Serializable {
	private static final long serialVersionUID = 1L;
	//Attributes
	private int E_ID;
	private double Price;
	private Location Location;
	private String Information;
	private Transportation Transport;
	//Brochure
	private Date Date;
	private Time Times;
	private String Duration;
	
	public int getE_ID() {
		return E_ID;
	}
	
	public void setID(int e_ID) {
		E_ID = e_ID;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double price) {
		Price = price;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}

	public String getInformation() {
		return Information;
	}

	public void setInformation(String information) {
		Information = information;
	}

	public Transportation getTransport() {
		return Transport;
	}

	public void setTransport(Transportation transport) {
		Transport = transport;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Time getTimes() {
		return Times;
	}

	public void setTimes(Time times) {
		Times = times;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	//Constructor
	public Excursion(int e_ID,double price,Location location,String information,
			Transportation transport,Date date,Time times,String duration){
		E_ID = e_ID;
		Price = price;
		Location = location;
		Information = information;
		Transport = transport;
		Date = date;
		Times = times;
		Duration = duration;
	}
	
	public String toString(){
		return "Location: " + Location.getName() + " Date: " + Date;
	}
}
