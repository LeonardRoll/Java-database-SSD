import java.io.Serializable;
import java.util.ArrayList;


public class Booking_Manager implements Serializable{
	private static final long serialVersionUID = 1L;
	private int ID;
	private Excursion Trip;
	private ArrayList<Passenger> Current_Passenger_List;
	private ArrayList<Passenger> Waiting_List;
	
	public boolean Check_Capacity(int capacity){
		if(Trip.getTransport().getCapacity() <= capacity)
			return false;
		else
			return true;
	}
	
	public int getID(){
		return ID;
	}
	
	public Excursion getExcursion(){
		return Trip;
	}
	
	public void Remove_Passenger(int findThisID){
		int i = 0;
		do{
			if(Current_Passenger_List.get(i).getP_ID() == findThisID){
				Current_Passenger_List.remove(i);
				MovetoPassengerList();
				break;
			}
			else
				i++;
		}while(!(Current_Passenger_List.get(i).getP_ID() == findThisID));
	}
	
	public void Remove_WaitingListMember(int findThisID){
		int i = 0;
		do{
			if(Waiting_List.get(i).getP_ID() == findThisID){
				Waiting_List.remove(i);
				break;
			}
			else
				i++;
		}while(!(Current_Passenger_List.get(i).getP_ID() == findThisID));
	}
	
	public Passenger getPassenger(int i){
		return Current_Passenger_List.get(i);
	}
	
	public Passenger getWaitingListMember(int i){
		return Waiting_List.get(i);
	}
	
	public int getPassengerListSize(){
		return Current_Passenger_List.size();
	}
	
	public int getWaitingListSize(){
		return Waiting_List.size();
	}
	
	public void addPassenger(Passenger passenger){
		try{
			if(Check_Capacity(Current_Passenger_List.size())){
				Current_Passenger_List.add(passenger);
			}
			else
				Waiting_List.add(passenger);
		}
		catch(Exception e){
			
		}
	}
	
	public void MovetoPassengerList(){
		try{
			while(!Check_Capacity(Current_Passenger_List.size())){
				Current_Passenger_List.add(Waiting_List.get(0));
				Waiting_List.remove(0);
			}
		}
		catch(Exception e){
			
		}
	}
	
	public Booking_Manager(Excursion trip){
		ID = trip.getE_ID();
		Trip = trip;
		Current_Passenger_List = new ArrayList<Passenger>();
		Waiting_List = new ArrayList<Passenger>();
	}
	
	public Booking_Manager(Excursion trip, ArrayList<Passenger>ThePassenger,ArrayList<Passenger>TheWaitingList){
		ID = trip.getE_ID();
		Trip = trip;
		Current_Passenger_List = ThePassenger;
		Waiting_List = TheWaitingList;
	}
}
