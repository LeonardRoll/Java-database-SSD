import java.io.Serializable;


public class Time implements Serializable{
	//Attributes
	private int Hour;
	private int Minute;
	
	public int getHour() {
		return Hour;
	}
	
	public void setHour(int hour) {
		Hour = hour;
	}
	
	public int getMinute() {
		return Minute;
	}
	
	public void setMinute(int minute) {
		Minute = minute;
	}
	
	public Time(int hour,int minute){
		Hour = hour;
		Minute = minute;
	}
}
