import java.io.*;

public class Date implements Serializable{
	//Attributes
	private String[] Months = {"January","February","March","April","May","June","July"
			,"August","September","October","November","December"};
	private int[] Years = new int[110]; //110 years;
	private String Month;
	private int Day;
	private int Year;
	
	//get and set functions
	public void set_Month(String month){
		Month = month;
	}
	
	public String get_Month(){
		return Month;
	}
	
	public void set_Day(int index){
		Day = index;
	}
	
	public int get_Day(){
		return Day;
	}
	
	public void set_Year(int index){
		Year = index;
	}
	
	public int get_Year(){
		return Year;
	}
	
	//Constructor
	public Date(int day,String month,int year){
		Day = day;
		Month = month;
		Year = year;
	}
	
	public String toString(){
		return Day + "/" + Month + "/" + Year; 
	}
}
