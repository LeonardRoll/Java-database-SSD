import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;


public class Booking_Overview_GUI extends JFrame{
	//Global
	Booking_Manager ThisBooking;
	public Booking_Overview_GUI(Booking_Manager Booking){
		/*Layout Setting*/
		ThisBooking = Booking;
		setTitle("Booking Overview");
		this.setLayout(new BorderLayout());
		
		/*Labels*/
		JLabel Trip_ID = new JLabel("ID: " + Integer.toString(Booking.getID()));
		JLabel Location_Name = new JLabel("Location: " + Booking.getExcursion().getLocation().getName());
		JLabel Waiting = new JLabel("Waiting List");
		JLabel Passengers = new JLabel("Passengers");
		//JPanels
		JPanel North_Panel = new JPanel();
		North_Panel.setLayout(new GridLayout(2,2));
		North_Panel.add(Trip_ID);
		North_Panel.add(Location_Name);
		North_Panel.add(Passengers);
		North_Panel.add(Waiting);
		this.add(North_Panel,"North");
		
		/*Table Creation*/
		DefaultTableModel Passenger_Table_Model = new DefaultTableModel();
		
		Object[] col = {"First Name" , "Last Name","ID"};
		
		Object[][] object = new Object[Booking.getPassengerListSize()][col.length];
		
		if(Booking.getPassengerListSize() != 0){
			for(int i = 0 ; i <  Booking.getPassengerListSize(); i++){
				object[i][0] = Booking.getPassenger(i).getPassenger_Name().getFirst_Name();
				object[i][1] = Booking.getPassenger(i).getPassenger_Name().getLast_Name();
				object[i][2] = Booking.getPassenger(i).getP_ID();
			}
		}
		
		Passenger_Table_Model.setDataVector(object,col);
		
		JTable Passenger_Table = new JTable(Passenger_Table_Model);
		Passenger_Table.setPreferredScrollableViewportSize(new Dimension(500,70));
		Passenger_Table.setFillsViewportHeight(true);
		
		JScrollPane Passenger_Table_Scroll = new JScrollPane(Passenger_Table);
		
		/*Table Creation*/
		DefaultTableModel Waiting_List_Table_Model = new DefaultTableModel();
		
		Object[] Wcol = {"First Name" , "Last Name","ID"};
		
		Object[][] Wobject = new Object[Booking.getWaitingListSize()][Wcol.length];
		
		if(Booking.getWaitingListSize() != 0){
			for(int i = 0 ; i <  Booking.getWaitingListSize(); i++){
				Wobject[i][0] = Booking.getWaitingListMember(i).getPassenger_Name().getFirst_Name();
				Wobject[i][1] = Booking.getWaitingListMember(i).getPassenger_Name().getLast_Name();
				Wobject[i][2] = Booking.getWaitingListMember(i).getP_ID();
			}
		}
		
		Waiting_List_Table_Model.setDataVector(Wobject,col);
		
		JTable Waiting_List_Table = new JTable(Waiting_List_Table_Model);
		Waiting_List_Table.setPreferredScrollableViewportSize(new Dimension(500,70));
		Waiting_List_Table.setFillsViewportHeight(true);
		
		JScrollPane Waiting_List_Table_Scroll = new JScrollPane(Waiting_List_Table);
		this.add(Passenger_Table_Scroll,"West");
		this.add(Waiting_List_Table_Scroll,"East");
		
		//South
		JPanel South_Panel = new JPanel();
		JButton Add = new JButton("Add");
		South_Panel.add(Add);
		this.add(South_Panel,"South");
		/*Listener*/
		Add_Button_Listener Add_Button_Listen = new Add_Button_Listener();
		Add.addActionListener(Add_Button_Listen);
	}
	
	/*Listener Classes*/
	public class Add_Button_Listener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			addPassengertoBooking addThem = new addPassengertoBooking(ThisBooking);
			addThem.pack();
			addThem.setLocationRelativeTo(null);
			addThem.setVisible(true);
		}
	}
}
