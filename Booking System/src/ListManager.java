import java.util.*;
import java.io.*;

public class ListManager {
	
	private ArrayList<Passenger> Passengers = new ArrayList<Passenger>();
	private ArrayList<Excursion> Trips = new ArrayList<Excursion>();
	private ArrayList<Booking_Manager> Bookings = new ArrayList<Booking_Manager>();
	public ArrayList<Integer> Search_Result = new ArrayList<Integer>();
	public ArrayList<Integer> Search_Result_Excursion = new ArrayList<Integer>();
	
	public ListManager()
	{
		FileInputStream fis=null;
    	ObjectInputStream ois=null;
    	try
    	{	
    	    fis = new FileInputStream("Passenger.dat");
    	    ois = new ObjectInputStream(fis);
    	    Passengers = (ArrayList<Passenger>)ois.readObject();
    	    ois.close();
    	    fis.close();
    	    fis = new FileInputStream("Excursion.dat");
    	    ois = new ObjectInputStream(fis);
    	    Trips = (ArrayList<Excursion>)ois.readObject();
    	    ois.close();
    	    fis.close();
    	    fis = new FileInputStream("Bookings.dat");
    	    ois = new ObjectInputStream(fis);
    	    Bookings = (ArrayList<Booking_Manager>)ois.readObject();
    	    ois.close();
    	    fis.close();
    	}
    	catch(Exception e)
    	{
    	    System.out.println("Problem in Passenger List");
    	}
    	
    	
    	for(int i = 0 ; i <= Passengers.size()-1 ; i++)
    		System.out.println(Passengers.get(i));
    	for(int i = 0 ; i <= Trips.size()-1 ; i++)
        		System.out.println(Trips.get(i));
    	for(int i = 0 ; i <= Bookings.size()-1 ; i++)
    		System.out.println(Bookings.get(i));
       	 System.out.println(Passengers.size());
    	 System.out.println(Trips.size());
    	 System.out.println(Bookings.size());
	}
	
	public int searchPassengerID(int FindID){
		int index = 0;
		for(int i = 0 ; i < Passengers.size()-1 ; i++){
			if(FindID == Passengers.get(i).getP_ID()){
				index = i;
			}
		}
		return index;
	}
	
	public int searchExcursionID(int FindID){
		int index = 0;
		for(int i = 0 ; i < Trips.size()-1 ; i++){
			if(FindID == Trips.get(i).getE_ID()){
				index = i;
			}
		}
		return index;
	}
	
	public int searchBookingID(int FindID){
		int index = 0;
		for(int i = 0 ; i < Bookings.size()-1 ; i++){
			if(FindID == Bookings.get(i).getID()){
				index = i;
			}
		}
		return index;
	}
	
	public Passenger get_Passenger(int index){
		return Passengers.get(index);
	}
	
	public Excursion get_Trip(int index){
		return Trips.get(index);
	}
	
	public Booking_Manager get_Booking(int index){
		return Bookings.get(index);
	}
	
	public void Add_Passenger_To_List(Passenger Npassenger)
	{
		Passengers.add(Npassenger);
		System.out.println(Passengers.size());
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
    		try
    		{
    			fos = new FileOutputStream("Passenger.dat");
    			oos = new ObjectOutputStream(fos);
    			oos.writeObject(Passengers);
    			System.out.println("Saved");
    			oos.close();
        		fos.close();
    		}
    		catch(IOException e)
    		{
    			System.out.println (e);
    			System.out.println("Problem writing object");
    		}
	}
	
	public void Add_Excursion_To_List(Excursion Nexcursion)
	{
		Trips.add(Nexcursion);
		System.out.println(Trips.size());
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
    		try
    		{
    			fos = new FileOutputStream("Excursion.dat");
    			oos = new ObjectOutputStream(fos);
    			oos.writeObject(Trips);
    			System.out.println("Saved");
    			oos.close();
        		fos.close();
    		}
    		catch(IOException e)
    		{
    			System.out.println (e);
    			System.out.println("Problem writing object");
    		}
	}
	
	public void Add_Booking_To_List(Booking_Manager Nbooking)
	{
		Bookings.add(Nbooking);
		System.out.println(Bookings.size());
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
    		try
    		{
    			fos = new FileOutputStream("Bookings.dat");
    			oos = new ObjectOutputStream(fos);
    			oos.writeObject(Bookings);
    			System.out.println("Saved");
    			oos.close();
        		fos.close();
    		}
    		catch(IOException e)
    		{
    			System.out.println (e);
    			System.out.println("Problem writing object");
    		}
	}
	
		public ArrayList<Integer> search_Passenger(String Passenger_Name){	
		
		Search_Result = new ArrayList<Integer>(); //Empties List
		//Creates List of Results
		for(int i = 0 ; i <= Passengers.size()-1 ; i++){
			if(Passenger_Name.equals(Passengers.get(i).getPassenger_Name().getFirst_Name())) 
			{
				Search_Result.add(Passengers.get(i).getP_ID());
			}
			
		}
		return Search_Result;
	}
	
	public int getPassengerListSize(){
		if(Passengers.isEmpty())
			return 0;
		else	
			return Passengers.size();
	}
	
	public int getExcursionListSize(){
		if(Trips.isEmpty())
			return 0;
		else
			return Trips.size();
	}
	
	public int getBookingListSize(){
		if(Bookings.isEmpty())
			return 0;
		else
			return Bookings.size();
	}
	
	public Passenger get_Passenger_at_ID(int R) {
		for(int i = 0 ; i <= getPassengerListSize()-1 ; i++){
			if(R==(get_Passenger(i).getP_ID())) 
			{
				return get_Passenger(i);
			}
		}
		return null;
	}
	
	public Excursion get_Excursion_at_ID(int R) {
		for(int i = 0 ; i <= getExcursionListSize()-1 ; i++){
			if(R==(get_Trip(i).getE_ID())) 
			{
				return get_Trip(i);
			}
		}
		return null;
	}
	
	public Booking_Manager get_Booking_at_ID(int R) {
		  for(int i = 0 ; i <= getBookingListSize()-1 ; i++){
		   if(R==(get_Booking(i).getID())) 
		   {
		    return get_Booking(i);
		   }
		  }
		  return null;
		 }
	
	public ArrayList<Integer> search_Excursion(String Excursion_Location){	
		
		Search_Result_Excursion = new ArrayList<Integer>(); //Empties List
		//Creates List of Results
		for(int i = 0 ; i <= Trips.size()-1 ; i++){
			if(Excursion_Location.equals(Trips.get(i).getLocation().getName())) 
			{
				Search_Result_Excursion.add(Trips.get(i).getE_ID());
			}
			
		}
		return Search_Result_Excursion;
	}
	
	public Boolean Uniuqe_Passenger(int ID){ 
		  
		  for(int i = 0 ; i <= Passengers.size()-1 ; i++){
		   if(ID==(Passengers.get(i).getP_ID())) 
		   {
		    return false;
		   }
		  }
		  return true;
		 }
		public Boolean Uniuqe_Excursion(int ID){ 
		  
		  for(int i = 0 ; i <= Trips.size()-1 ; i++){
		   if(ID==(Trips.get(i).getE_ID())) 
		   {
		    return false;
		   }
		  }
		  return true;
		 }
	
	public boolean uniqueBooking(int FindID){
		if(getBookingListSize() <= 0)
			return true;
		else{
			for(int i = 0; i <= getBookingListSize() ; i++){
				if(FindID == Bookings.get(i).getID()){
					return false;
				}
			}
			return true;
		}
	}
	
	public void RemoveObject(Object designated) 
	{
		System.out.println(designated);
		if(designated instanceof Passenger)
		{
			Integer ID =((Passenger) designated).getP_ID();
			for(int i = 0 ; i <= Passengers.size()-1 ; i++)
			{
				System.out.println(ID);
				System.out.println(Passengers.get(i).getP_ID());
				if(ID==(Passengers.get(i).getP_ID())) 
				{
					Passengers.remove(i);
					System.out.println(Passengers.size());
		
					FileOutputStream fos=null;
					ObjectOutputStream oos=null;
					try
					{
						fos = new FileOutputStream("Passenger.dat");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(Passengers);
						System.out.println("Saved");
						oos.close();
						fos.close();
					}
					catch(IOException e)
					{
						System.out.println (e);
						System.out.println("Problem writing object");
					};
				}
			}	
		}
		else if(designated instanceof Excursion)
		{
			Integer ID =((Excursion) designated).getE_ID();
			for(int i = 0 ; i <= Trips.size()-1 ; i++)
			{
				if(ID==(Trips.get(i).getE_ID())) 
				{
					Trips.remove(i);
					
					System.out.println(Trips.size());
					
					FileOutputStream fos=null;
					ObjectOutputStream oos=null;
					try
					{
						fos = new FileOutputStream("Excursion.dat");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(Trips);
						System.out.println("Saved");
						oos.close();
						fos.close();
					}
					catch(IOException e)
					{
						System.out.println (e);
						System.out.println("Problem writing object");
					};
					
					
				}
			}
			
		}
		else if(designated instanceof Booking_Manager)
		{
			Integer ID =((Booking_Manager) designated).getID();
			for(int i = 0 ; i <= Bookings.size()-1 ; i++)
			{
				if(ID==(Bookings.get(i).getID())) 
				{
					Bookings.remove(i);
					System.out.println(Bookings.size());
					
					FileOutputStream fos=null;
					ObjectOutputStream oos=null;
					try
					{
						fos = new FileOutputStream("Bookings.dat");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(Bookings);
						System.out.println("Saved");
						oos.close();
						fos.close();
					}
					catch(IOException e)
					{
						System.out.println (e);
						System.out.println("Problem writing object");
					};
				}
			}
		}
	}
}
